package io.hanko.webauthn.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.hanko.sdk.HankoClient;
import io.hanko.sdk.models.CreateWebAuthnRequest;
import io.hanko.sdk.models.HankoRequest;
import io.hanko.sdk.models.Operation;
import io.hanko.webauthn.UserProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class HankoController {

    private final HankoClient hankoClient;
    private final UserProperties user;

    @GetMapping("/begin_registration")
    public HankoRequest beginRegistration() {
        return getHankoRequest(Operation.REG);
    }

    @GetMapping("/begin_authentication")
    public HankoRequest beginAuthentication() {
        return getHankoRequest(Operation.AUTH);
    }

    @GetMapping("/begin_deregistration")
    public HankoRequest beginDeregistration() {
        return getHankoRequest(Operation.DEREG);
    }

    private HankoRequest getHankoRequest(final Operation operation) {
        CreateWebAuthnRequest request = new CreateWebAuthnRequest();
        request.setUsername(user.getUsername());
        request.setOperation(operation);
        request.setUserId(user.getUserId());
        return hankoClient.requestWebAuthnOperation(request);
    }

    @PostMapping("/finalization")
    public HankoRequest finalizeRegistration(
            @RequestParam String requestId,
            @RequestBody String webAuthnResponse) throws JsonProcessingException {

        return hankoClient.validateWebAuthnRequest(requestId, webAuthnResponse);
    }
}

package io.hanko.webauthn.controller;

import io.hanko.webauthn.UserProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final UserProperties user;

    @GetMapping({"/", "/show_registration"})
    public String registration(Model model) {
        setUserId(model);
        return "registration";
    }

    @GetMapping("/show_authentication")
    public String authentication(Model model) {
        setUserId(model);
        return "authentication";
    }

    @GetMapping("/show_deregistration")
    public String deregistration(Model model) {
        setUserId(model);
        return "deregistration";
    }

    private void setUserId(Model model) {
        model.addAttribute("userId", user.getUserId());
    }
}

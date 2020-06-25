package io.hanko.webauthn;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserProperties {
    private String username;
    private String userId = UUID.randomUUID().toString();
}

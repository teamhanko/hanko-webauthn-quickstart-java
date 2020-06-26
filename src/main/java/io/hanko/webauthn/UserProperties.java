package io.hanko.webauthn;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.UUID;

@Getter
@Setter
@ConfigurationProperties("user")
public class UserProperties {
    private String username;
    private String userId = UUID.randomUUID().toString();
}

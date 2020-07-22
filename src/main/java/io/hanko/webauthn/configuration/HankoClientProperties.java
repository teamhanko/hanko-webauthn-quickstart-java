package io.hanko.webauthn.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ConfigurationProperties("client")
@Validated
public class HankoClientProperties {
    @NotBlank
    private String apiUrl;
    @NotBlank
    private String apiKey;
    @NotBlank
    private String apiKeyId;
}

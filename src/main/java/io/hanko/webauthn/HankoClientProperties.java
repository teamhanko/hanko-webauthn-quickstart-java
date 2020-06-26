package io.hanko.webauthn;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("client")
public class HankoClientProperties {
    private String apiUrl;
    private String apiKey;
    private String apiKeyId;
}

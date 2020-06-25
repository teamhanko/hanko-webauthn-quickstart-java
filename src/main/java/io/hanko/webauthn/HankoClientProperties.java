package io.hanko.webauthn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HankoClientProperties {
    private String apiUrl;
    private String apiKey;
    private String apiKeyId;
}

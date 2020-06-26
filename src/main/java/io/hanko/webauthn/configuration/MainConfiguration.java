package io.hanko.webauthn.configuration;

import io.hanko.sdk.HankoClient;
import io.hanko.sdk.HankoClientConfig;
import io.hanko.sdk.util.HankoUtils;
import io.hanko.webauthn.HankoClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    public HankoClient hankoClient(HankoClientProperties properties) {

        HankoClientConfig hankoClientConfig = new HankoClientConfig(
                properties.getApiUrl(),
                properties.getApiKeyId(),
                properties.getApiKey()
        );

        return HankoUtils.createHankoClient(hankoClientConfig);
    }
}

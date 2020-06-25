package io.hanko.webauthn.configuration;

import io.hanko.sdk.HankoClient;
import io.hanko.sdk.HankoClientConfig;
import io.hanko.sdk.util.HankoUtils;
import io.hanko.webauthn.HankoClientProperties;
import io.hanko.webauthn.UserProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    public HankoClient hankoClient() {
        HankoClientProperties properties = hankoClientProperties();

        HankoClientConfig hankoClientConfig = new HankoClientConfig(
                properties.getApiUrl(),
                properties.getApiKeyId(),
                properties.getApiKey()
        );

        return HankoUtils.createHankoClient(hankoClientConfig);
    }

    @Bean
    @ConfigurationProperties("client")
    public HankoClientProperties hankoClientProperties() {
        return new HankoClientProperties();
    }

    @Bean
    @ConfigurationProperties("user")
    public UserProperties userProperties() {
        return new UserProperties();
    }
}

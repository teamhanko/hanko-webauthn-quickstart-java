package io.hanko.webauthn.configuration;

import io.hanko.webauthn.UserProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    @ConfigurationProperties("user")
    public UserProperties userProperties() {
        return new UserProperties();
    }
}

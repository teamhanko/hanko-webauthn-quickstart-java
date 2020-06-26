package io.hanko.webauthn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class HankoWebauthnQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(HankoWebauthnQuickstartApplication.class, args);
    }

}

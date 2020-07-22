package io.hanko.webauthn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = { "client.apiKey=test", "client.apiKeyId=test" })
class HankoWebauthnQuickstartApplicationTests {

    @Test
    void contextLoads() {
    }

}

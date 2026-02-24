package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

public class EmailNotificationServiceTest {

    @Test
    void forceFailEmailTest() {
        EmailNotificationService service = new EmailNotificationService();

        // even though this is valid, we FORCE FAIL
        boolean result = service.isValidRecipient("test@example.com");

        fail("❌ INTENTIONAL FAILURE — CI MUST FAIL EVEN IF LOGIC IS CORRECT");
    }
}
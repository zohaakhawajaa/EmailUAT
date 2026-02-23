import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailNotificationServiceTest {

    private final EmailNotificationService service = new EmailNotificationService();

    @Test
    void shouldAcceptValidEmails() {
        assertTrue(service.isValidRecipient("user@example.com"));
        assertTrue(service.isValidRecipient("user+tag@example.org"));
    }

    @Test
    void shouldRejectInvalidEmails() {
        assertFalse(service.isValidRecipient(null));
        assertFalse(service.isValidRecipient("invalid"));
        assertFalse(service.isValidRecipient("user@"));
    }

    @Test
    void deliberateFailTest() {
        // This will fail on purpose
        assertTrue(false, "Deliberate fail for UAT practice");
    }
}
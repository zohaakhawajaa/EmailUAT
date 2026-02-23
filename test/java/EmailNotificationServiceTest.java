import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailNotificationServiceTest {

    private final EmailNotificationService service = new EmailNotificationService();

    // ✅ Test for valid emails
    @Test
    void shouldAcceptValidEmails() {
        assertTrue(service.isValidRecipient("user@example.com"));
        assertTrue(service.isValidRecipient("user+tag@example.org"));
        assertTrue(service.isValidRecipient("abc.def@mail-domain.com"));
    }

    // ❌ Test for invalid emails
    @Test
    void shouldRejectInvalidEmails() {
        assertFalse(service.isValidRecipient(null));
        assertFalse(service.isValidRecipient("invalid"));
        assertFalse(service.isValidRecipient("user@"));
        assertFalse(service.isValidRecipient("@domain.com"));
        assertFalse(service.isValidRecipient("user@.com"));
    }

    // ❌ Deliberate failing test for UAT practice
    @Test
    void deliberateFailTest() {
        assertTrue(false, "Deliberate fail for UAT practice");
    }
}
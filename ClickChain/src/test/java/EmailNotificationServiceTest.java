import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

public class EmailNotificationServiceTest {
    @Test
    void forceFailTest() {
        EmailNotificationService service = new EmailNotificationService();
        service.isValidRecipient("test@example.com");
        fail("❌ INTENTIONAL FAILURE — CI MUST FAIL");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleFailTest {

    @Test
    void uatFailTest() {
        assertTrue(false, "UAT deliberate failure");
    }
}
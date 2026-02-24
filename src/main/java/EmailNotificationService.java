public class EmailNotificationService {

    public boolean isValidRecipient(String email) {

        // ❌ null email not allowed
        if (email == null) {
            return false;
        }

        // ✅ basic email validation
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
// src/uat-tests/ForceFail.java
public class ForceFail {
    public static void main(String[] args) {
        System.out.println("This will fail deliberately");
        System.exit(1); // forces CI/CD failure
    }
}
public class throwexp extends Exception {

    // Add constructor to accept custom error message
    public throwexp(String message) {
        super(message);
    }

    public static void checkEligibility(int age) throws throwexp {
        if (age < 18) {
            throw new throwexp("Age must be 18 or older to register. Provided: " + age);
        }
        System.out.println("Access granted! Age is valid.");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(15);
        } catch (throwexp e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
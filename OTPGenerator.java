import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a 6-digit OTP number
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        
        // Check if all OTPs are unique by adding them to a HashSet
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // If add() returns false, that means it's a duplicate
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all the OTPs are unique
        boolean isUnique = areOTPsUnique(otps);
        
        if (isUnique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}

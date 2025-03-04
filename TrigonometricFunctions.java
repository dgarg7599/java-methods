import java.util.Scanner;
public class TrigonometricFunctions {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        //user input for angle and declraing result array
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);
    }
  // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}
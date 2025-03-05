import java.util.Scanner;

public class SixthNumberChecker {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Count factors first
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Store the factors in the array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) { // Proper divisors (exclude the number itself)
            sumOfDivisors += factors[i];
        }
        return sumOfDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) { // Proper divisors (exclude the number itself)
            sumOfDivisors += factors[i];
        }
        return sumOfDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sumOfDivisors = 0;
        int[] factors = findFactors(number);
        for (int i = 0; i < factors.length - 1; i++) { // Proper divisors (exclude the number itself)
            sumOfDivisors += factors[i];
        }
        return sumOfDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int originalNumber = number;
        
        // Extract each digit and find the factorial of each digit
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit); // Add the factorial of the digit
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int number = sc.nextInt();  // You can change this number to test with other inputs

        // Find the factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Find the sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Find the product of factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Find the product of cubes of factors
        double productOfCubes = findProductOfCubeOfFactors(factors);
        System.out.println("Product of Cube of Factors: " + productOfCubes);

        // Check if the number is perfect
        boolean perfect = isPerfectNumber(number);
        System.out.println(number + " is Perfect? " + perfect);

        // Check if the number is abundant
        boolean abundant = isAbundantNumber(number);
        System.out.println(number + " is Abundant? " + abundant);

        // Check if the number is deficient
        boolean deficient = isDeficientNumber(number);
        System.out.println(number + " is Deficient? " + deficient);

        // Check if the number is strong
        boolean strong = isStrongNumber(number);
        System.out.println(number + " is Strong? " + strong);
    }
}

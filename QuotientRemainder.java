import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
		//user input for number and divisor
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }        
    }
     // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}

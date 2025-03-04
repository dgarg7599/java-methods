import java.util.Scanner;
public class NumberChecker{
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
      //user input for number
        int number = scanner.nextInt();
        
        // Call the method and display the result
        int result = checkNumber(number);
        
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    // Method to check the sign of a number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

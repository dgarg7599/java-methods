import java.util.Scanner;

public class ChocolateDistribution{
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        // user input of no of chocolates and children
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
    // Method to calculate chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}

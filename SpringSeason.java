import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
    // Method to check if the given month and day fall in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||  // March 20 onwards
            (month == 4) ||  // Entire April
            (month == 5) ||  // Entire May
            (month == 6 && day <= 20)) {  // Up to June 20
            return true;
        }
        return false;
    }
}

import java.util.Scanner;

public class FriendFinder {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestName = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestName = names[i];
            }
        }
        return youngestName;
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestName = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestName = names[i];
            }
        }
        return tallestName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest and tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
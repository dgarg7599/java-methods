import java.util.Random;

public class FootballTeamHeight {

    // Method to generate random heights between 150 and 250 cm for 11 players
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        // Generate random heights in the range 150 to 250 cm
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150;  // Random number between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height of players
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return sum / (double) heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int size = 11;  // Number of players in the football team
        int[] heights = generateRandomHeights(size);

        // Calculate sum, mean, shortest and tallest heights
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display the results
        System.out.println("Heights of the players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        System.out.println("Total Height of all players: " + sum + " cm");
        System.out.println("Mean Height of players: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}

import java.util.Scanner;
class TrianglePark{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//user input for each side of triangle
	int firstSide = sc.nextInt();
	int secondSide = sc.nextInt();
	int thirdSide = sc.nextInt();
	//storing perimter in variable
	int perimeter = firstSide+secondSide+thirdSide;
	// printing the result how many round it would take to complete 5km run via helper method
	System.out.println("It would take "+RoundsCalculator(perimeter)+" rounds to complete 5km run");
	}
	// designing helper function to calculate the no of rounds
	public static double RoundsCalculator(int perimeter){
	double result = 5000/perimeter;
	return result;
	}
} 

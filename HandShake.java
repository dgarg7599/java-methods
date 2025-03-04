import java.util.Scanner;
class HandShake{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//user input for no of students
	int students = sc.nextInt();
	// calculate and printing no of handshake via helper method
	System.out.println("No of HandShake possible are "+HandShakeCalculator(students));
	}
	//creating helper method to find maximum no of handshakes amoung student
	public static int HandShakeCalculator(int students){
	//using formula (n*(n-1))/2
	int result = (students*(students-1))/2;
	return result;
	}
}
	

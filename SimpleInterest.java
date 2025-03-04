import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// user input for prinicipal,rate and time
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		// printing the result via helper method
		System.out.println(SimpleInterestHelper(principal,rate,time));
		}
	//defining helper method for getting simple interest
	public static int SimpleInterestHelper(int principal,int rate , int time){
		int result  = (principal*rate*time)/100;
		return result;
		}
	}

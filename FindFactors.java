import java.util.Scanner;
import java.lang.Math;

public class FindFactors {

	public static int[] findFactorsOfNumber(int num){
		int count = 0;
		//First loop to count the number of factors
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		//Initialise array with the factors
		int[] factors = new int[count];
		int idx = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				factors[idx++] = i;
			}
		}
		return factors;
	}

	// Method to calculate the sum of factors
	public static int findSumOfFactors(int[] factors){
		int sum = 0;
		for(int i: factors){
			sum += i;
		}
		return sum;
	}

	// Method to calculate the product of factors
	public static int findProductOfFactors(int[] factors){
		int product = 1;
		for(int i: factors){
			product *= i;
		}
		return product;
	}

	// Method to calculate the sum of squares of factors
	public static int findSumOfSquares(int[] factors){
		int sum = 0;
		for(int i: factors){
			sum += Math.pow(i, 2);
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int[] factorsOfNumber = findFactorsOfNumber(number);

		for(int i: factorsOfNumber){
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("The sum of factors is: " + findSumOfFactors(factorsOfNumber));
		System.out.println("The product of factors is: " + findProductOfFactors(factorsOfNumber));
		System.out.println("The sum of squares of factors is: " + findSumOfSquares(factorsOfNumber));
	}
}

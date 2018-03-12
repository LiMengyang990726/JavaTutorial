import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		int lowerBound, higherBound,sum;
		Scanner in = new Scanner (System.in);
		double average;

		System.out.print("Enter the lowerbound: ");
		lowerBound = in.nextInt();
		System.out.print("Enter the upperbound: ");
		higherBound = in.nextInt();

		sum = (lowerBound + higherBound)*(higherBound - lowerBound + 1 )/2;
		average = (double)sum/(higherBound - lowerBound + 1);

		System.out.print("The sum is: " + sum);
	    System.out.printf("The average is: %.2f",average);

	    in.close();
	}
}
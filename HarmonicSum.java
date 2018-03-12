import java.util.Scanner;

public class HarmonicSum {
	public static void main(String[] args) {
		int maxDenominator;
		double sumL2R = 0.0, sumR2L = 0.0;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter the max denominator: ");
		maxDenominator = in.nextInt();

		for(int counter = 1; counter <= maxDenominator; counter++){
			sumL2R += (double)1/counter; 
		}
		System.out.println("The sum from left-to-right is: " + sumL2R);

		for(int counter = 1; (counter >= 1) && (maxDenominator - counter + 1) >= 1; counter++){
			sumR2L += (double)1/(maxDenominator - counter + 1);
		}
		System.out.println("The sum from right-to-left is: " + sumR2L);

		System.out.println("The absolute difference is: "+Math.abs(sumR2L - sumL2R));
	}
}
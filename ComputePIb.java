import java.util.Scanner;

public class ComputePIb {
	public static void main(String[] args) {
		int maxTerms;
		double terms = 0, result;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of terms used for computation: ");
		maxTerms = in.nextInt();

		for (int counter = 1; counter <= maxTerms; counter++){
			terms += (Math.pow(-1,counter+1))*(1.0/(2*counter-1));
		}

		result = 4*terms;

		System.out.printf("The PI computed is: %.10f",result);
		
	}
}
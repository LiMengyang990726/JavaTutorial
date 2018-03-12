import java.util.Scanner;

public class Exponent {
	public static void main(String[] args) {
		int base, exp;
		int result;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the base: ");
		base = in.nextInt();
		System.out.println("Enter the exponent: ");
		exp = in.nextInt();

		result = exponent(base,exp);
		System.out.println(base+" raises to the power "+exp+" is: "+result);

	}
	public static int exponent(int base, int exp){
		int result = 1;
		for(int i = 0; i < exp; i++){
			result *= base;
		}
		return result;
	}
}
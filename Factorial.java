import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int integer;
		int factorial = 1;
		Scanner in = new Scanner (System.in);

		System.out.print("Enter an integer: ");
		integer = in.nextInt();

		for(int counter = 1 ; counter <= integer; counter++){
			factorial *= counter;
		}

		System.out.println("The Factorial of " + integer + " is: " + factorial);
	}
}
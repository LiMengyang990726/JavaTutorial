import java.util.Scanner;
public class Add2Integer {

	public static void main(String[] args) {
		int integer1,integer2;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter first integer: ");
		integer1 = in.nextInt();
		System.out.println("Enter second integer: ");
		integer2 = in.nextInt();
		
		System.out.println("The sum is: "+(integer1+integer2));
	}

}
import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		int integer1,integer2,integer3;
		Scanner in = new Scanner (System.in);
		int Max,Min;

		System.out.print("Enter 1st integer: ");
		integer1 = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		integer2 = in.nextInt();
		System.out.print("Enter 3rd integer: ");
		integer3 = in.nextInt();

		System.out.println("The sum is: "+(integer1+integer2+integer3));
		System.out.println("The product is: "+(integer1*integer2*integer3));

		Max = integer1;
		Min = integer1;

		if(integer2>Max){
			Max = integer2;
		}
		if(integer3>Max){
			Max = integer3;
		}

		if(integer2<Min){
			Min = integer2;
		}
		if(integer3<Min){
			Min = integer3;
		}

		System.out.println("The min is: "+Min);
		System.out.println("The max is: "+Max);

	}
}
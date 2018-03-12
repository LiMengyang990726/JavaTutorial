import java.util.Scanner;

public class SumProductMinMax5 {

	public static void main(String[] args) {
		int integer1,integer2,integer3,integer4,integer5;
		Scanner in = new Scanner (System.in);
		int Max,Min;

		System.out.print("Enter 1st integer: ");
		integer1 = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		integer2 = in.nextInt();
		System.out.print("Enter 3rd integer: ");
		integer3 = in.nextInt();
		System.out.print("Enter 4th integer: ");
		integer4 = in.nextInt();
		System.out.print("Enter 5th integer: ");
		integer5 = in.nextInt();

		System.out.println("The sum is: "+(integer1+integer2+integer3+integer4+integer5));
		System.out.println("The product is: "+(integer1*integer2*integer3*integer4*integer5));

		Max = integer1;
		Min = integer1;

		if(integer2>Max){
			Max = integer2;
		}
		if(integer3>Max){
			Max = integer3;
		}
		if(integer4>Max){
			Max = integer4;
		}
		if(integer5>Max){
			Max = integer5;
		}


		if(integer2<Min){
			Min = integer2;
		}
		if(integer3<Min){
			Min = integer3;
		}
		if(integer4<Min){
			Min = integer4;
		}
		if(integer5<Min){
			Min = integer5;
		}

		System.out.println("The min is: "+Min);
		System.out.println("The max is: "+Max);

	}
}
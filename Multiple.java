import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		int integer1,integer2,multiple;
		Scanner in = new Scanner (System.in);

		System.out.print("Enter 1st integer: ");
		integer1 = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		integer2 = in.nextInt();

		if((integer1%integer2 == 0)&&(integer2<=integer1)){
			System.out.print(integer1+" IS a multiple of "+integer2);
		}else{
			System.out.print(integer1+" IS NOT a multiple of "+integer2);
		}
		
	}
}
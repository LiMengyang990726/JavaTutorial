import java.util.Scanner;

public class RectangleComputation {
	public static void main(String[] args) {
		int length, width,perimeter,area;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter the length: ");
		length = in.nextInt();
		System.out.println("Enter the width: ");
		width = in.nextInt();
		
		System.out.println("The perimeter is: "+ (2*(length+width))  );
		System.out.println("The area is: "+ (length*width)   );
	}
}
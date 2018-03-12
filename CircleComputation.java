import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
 		double radius,diameter,circumference,area;
 		Scanner in = new Scanner (System.in);

 		System.out.println("Enter the radius: ");
 		radius = in.nextDouble();

 		System.out.printf("Diameter is: %.2f", (2*radius));
 		System.out.println();
 		System.out.printf("Circumference is: %.2f", (2*Math.PI*radius));
 		System.out.println();
 		System.out.printf("Area is: %.2f", (Math.PI*Math.pow(radius,2)));
 		System.out.println();
	}
}
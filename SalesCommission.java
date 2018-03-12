import java.util.Scanner;

public class SalesCommission {
	public static void main(String[] args) {
		double salary;
		double sales;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter sales in dollars (-1 to end): ");
		sales = in.nextDouble();

		while(sales != -1.0){
			salary = 200.0 + 0.09 * sales;
			System.out.printf("Salary is: $%.2f%n%n",salary);
			System.out.println("Enter sales in dollars (-1 to end): ");
			sales = in.nextDouble();
		}
			// be careful which sentenses should come out together and when to end the loop!!
		System.out.println("bye");	
	}
}
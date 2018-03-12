import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double salary;
		int hours,hoursRate;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter hours worked (-1 to end): ");
		hours = in.nextInt();

		while(hours != -1){
			System.out.println("Enter hourly rate of the employee: ");
			hoursRate = in.nextInt();

			if(hours <= 40){
				salary = (double) hours * hoursRate;
				System.out.printf("Salary is: $%.2f%n%n",salary);
			}else if (hours > 40){
				salary = (double) (hours-40) * hoursRate * 1.5 + 40 * hoursRate;
				System.out.printf("Salary is: $%.2f%n%n",salary);
			}else {
				System.out.print("Wrong input %n");
			}

			
			System.out.println("Enter hours worked (-1 to end): ");
			hours = in.nextInt();

		}
	
		System.out.println("bye");	
	}
}
import java.util.Scanner;

public class PrintDayInWord{

	public static void main(String[] args) {
		int day;
		Scanner in = new Scanner (System.in);

		System.out.print("Enter the day number: ");
		day = in.nextInt();
		switch(day){
			case 0: System.out.println("Sunday");
						break;
			case 1: System.out.println("Monday");
						break;
			case 2: System.out.println("Tuesday");
						break;
			case 3: System.out.println("Wednesday");
						break;
			case 4: System.out.println("Thursday");
						break;
			case 5: System.out.println("Friday");
						break;
			case 6: System.out.println("Saturday");
						break;
			default: System.out.println("Not a valid day");
			//be careful that if the user input of the day is a number , the option of the switch case should be a number also.
		}

		System.out.print("bye");
		}
		
}

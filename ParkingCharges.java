import java.util.Scanner;

public class ParkingCharges {
	public static void main (String[] args) {
		double parkingfee,total = 0.0;
		double hours;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter the hours parked (-1 to end): ");
		hours = in.nextDouble();

		while(hours != -1){
			
			if(Math.ceil (hours) <= 3){
				parkingfee = 2.0;
			}else if ((Math.ceil(hours) > 3 ) && (Math.ceil(hours) < 19)){
				parkingfee = 2 + 0.5*(Math.ceil(hours) - 3);
			}else {
				parkingfee = 10.0;
			}
			total += parkingfee;
			
			System.out.printf("Parking fee is: $%.2f",parkingfee);
			System.out.println(); 
			System.out.println("Enter the hours parked (-1 to end): ");
			hours = in.nextDouble();
		}

		System.out.printf("Your total parking fee is: $%.2f",total);
		System.out.println();
		System.out.println("bye");
	}
}

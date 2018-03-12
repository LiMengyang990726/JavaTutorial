import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		int upperbound;
		boolean result;

		Scanner in = new Scanner (System.in);
		System.out.println("Enter the upperbound: ");
		upperbound = in.nextInt();

		System.out.println("Perfect numbers between 1 and "+upperbound+" are:");
		for(int i = 1; i <= upperbound; i++){
			result = isPerfect(i);
			if(result == true){
				System.out.print(i+" =");
				printFactor(i);
				System.out.println();
			}
		}
	}
	public static boolean isPerfect(int number) {
		int sum = 0;
		for(int i = 1; i <= (number/2); i ++) {
			if(number%i == 0){
				sum+=i;
			}
		}
		if(sum == number){
			return true;
		}else{
			return false;
		}
	}
  	public static void printFactor(int number) {
  		System.out.print(" 1");
  		for(int i = 2; i <= (number/2); i++) {
  			if(number%i == 0){
  				System.out.print(" + "+i);
  			}
  		}
  	}
}
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int number;
		boolean result;

		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number: ");
		number = in.nextInt();
		result = isOdd(number);

		if(result == true){
			System.out.println(number+" is an odd number");
		}else{
			System.out.println(number+" is an even number");
		}
	}
	public static boolean isOdd(int number){
		if((number%2 == 1)||(number%2 == -1)){
			return true;
		}else{
			return false;
		}
	}
}
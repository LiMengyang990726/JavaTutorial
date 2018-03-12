import java.util.Scanner;

public class Oct2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen,result = 0,tempInt;
		char temp;
		boolean user = true; 

		Scanner in = new Scanner (System.in);
		System.out.print("Enter an octal string: ");
		inStr = in.next();
		inStrLen = inStr.length();

		for(int power = 0; power < inStrLen; power++){
			temp = inStr.charAt(inStrLen - 1 - power);
			tempInt = temp - '0';
			result += tempInt * Math.pow(8,power);
		}
				
			System.out.println("The decimal equivalent is: "+result);
	}
}
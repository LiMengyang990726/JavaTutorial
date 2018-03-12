import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		String inStr;
		int inStrLen,result = 0;
		char temp;

		Scanner in = new Scanner (System.in);
		System.out.println("Enter a binary string: ");
		inStr = in.next();
		inStrLen = inStr.length();

		for(int power = 0; power < inStrLen; power++){
			temp = inStr.charAt(inStrLen - 1 - power);

			if(temp == '1'){
				result += Math.pow(2,power);
			}
		}

		System.out.print("The decimal equivalent is: "+result);
		
	}
}
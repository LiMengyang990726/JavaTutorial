import java.util.Scanner;

public class Bin2DecRepeat {
	public static void main(String[] args) {
		String inStr;
		int inStrLen,result = 0;
		char temp;
		boolean user = true; 

		Scanner in = new Scanner (System.in);
		System.out.print("Enter a binary string: ");
		inStr = in.next();
		inStrLen = inStr.length();

		if(inStr.charAt(0)=='-'){
			user = false;
			System.out.println("bye");
		}
//while(!binaryString.equal(sentinel))
		while(user == true){
			for(int power = 0; power < inStrLen; power++){
				temp = inStr.charAt(inStrLen - 1 - power);

				if(temp == '1'){
					result += Math.pow(2,power);
				}
			}
				
			System.out.println("The decimal equivalent is: "+result);
			System.out.println();

			result = 0;
			
			System.out.print("Enter a binary string: ");
			inStr = in.next();
			inStrLen = inStr.length();

			if(inStr.charAt(0)=='-'){
				user = false;
				System.out.println("bye");
			}
		}
	}
}
import java.util.Scanner;

public class PhoneKeyPad {
	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		char temp;

		Scanner in = new Scanner (System.in);
		System.out.println("Enter a String: ");
		inStr = in.next().toUpperCase();
		inStrLen = inStr.length();

		System.out.print("The phone number is: ");
//ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
		for(int i = 0; i < inStrLen; i++){
			temp = inStr.charAt(i);

			if((temp == 'A')||(temp == 'B')||(temp == 'C')){
				System.out.print("2");
			}else if((temp == 'D')||(temp == 'E')||(temp == 'F')){
				System.out.print("3");
			}else if((temp == 'G')||(temp == 'H')||(temp == 'I')){
				System.out.print("4");
			}else if((temp == 'J')||(temp == 'K')||(temp == 'L')){
				System.out.print("5");
			}else if((temp == 'M')||(temp == 'N')||(temp == 'O')){
				System.out.print("6");
			}else if((temp == 'P')||(temp == 'Q')||(temp == 'R')||(temp == 'S')){
				System.out.print("7");
			}else if((temp == 'T')||(temp == 'U')||(temp == 'V')){
				System.out.print("8");
			}else if((temp == 'W')||(temp == 'X')||(temp == 'Y')||(temp == 'Z')){
				System.out.print("9");
			}else if(Character. isDigit(temp)){
				System.out.print(temp);
			}else{
				System.out.println("Error character!");
			}
		}
	}
}
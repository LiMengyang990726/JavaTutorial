import java.util.Scanner;

public class HillPattern {
	public static void main(String[] args) {
		int row,column,start;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the rows: ");
		row = in.nextInt();

		column = 2*row - 1;

		start = column/2;

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column;j++){
				if(row%2==1) {
					if(  (i+j>=start) && (i+j<=(2*i+start))  ){
						System.out.print("^");
					}else{
						System.out.print(" ");
					}
				}else {
					if(  (i+j>=start) && (i+j<(2*i+(start+1)))  ){
						System.out.print("^");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}
}
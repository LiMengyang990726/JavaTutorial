import java.util.Scanner;

public class BoxCrossPattern {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size: ");
		size = in.nextInt();

		for(int row = 0; row < size; row++){
			for(int column = 0; column < size; column++){

				//print the bound
				if((row == 0) ||(row == size-1)){
					System.out.print("*");
				}else if((column == 0) || (column == size-1)){
					System.out.print("*");
				}

				//print the inner cross
				if((((row + column) == (size-1)) || (row == column)) && (row != 0) && (row != size-1) && (column != 0) && (column != size-1)){
					System.out.print("+");
				}else if((row != 0)&&(row != size-1)&&(column != 0)&&(column != size-1)){
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
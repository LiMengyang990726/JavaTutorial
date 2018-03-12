import java.util.Scanner;

public class TriangularPattern {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size: ");
		size = in.nextInt();

		for(int row = 0; row < size; row++){
			for(int column = 0; column < size; column++){
			
				if ((row + column >= (size-1)) || (column == (size-1)) || (row == (size-1))){
					System.out.print("*"); 
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
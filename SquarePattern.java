import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		int Size;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter the size: ");
		Size = in.nextInt();
		for(int i = 0; i < Size; i++){
			for(int j = 0; j< Size; j++){
				System.out.print("#");
			}
			System.out.println();
		}

	}
}
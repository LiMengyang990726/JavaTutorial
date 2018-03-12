import java.util.Scanner;

public class Checkboard {
	public static void main(String[] args) {
		int Size;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size: ");
		Size = in.nextInt();
		for(int i = 0; i < Size; i++){
			if(i%2 == 1)
				System.out.print(" ");

			for(int j = 0; j < Size; j++){
				System.out.print("# ");
			}

			System.out.println();
		}

	}
}
import java.util.Scanner;

public class GradesHorizontalHistogram {
	public static void main(String[] args) {
		int numOfStudent;
		int counter0 = 0,counter10 = 0,counter20 = 0,counter30 = 0,counter40 = 0,counter50 = 0,counter60 = 0,counter70 = 0,counter80 = 0,counter90 = 0;
		Scanner in = new Scanner (System.in);

		System.out.println("Enter the number of students: ");
		numOfStudent = in.nextInt();
		int[] grades = new int[numOfStudent];

		for(int i = 0; i < numOfStudent; i++) {
			System.out.println("Enter the grade for student "+(i+1)+": ");
			grades[i] = in.nextInt();

			if((grades[i] >= 0)&&(grades[i] <= 9)){
				counter0 ++;
			}
			if((grades[i] >= 10)&&(grades[i] <= 19)){
				counter10 ++;
			}
			if((grades[i] >= 20)&&(grades[i] <= 29)){
				counter20 ++;
			}
			if((grades[i] >= 30)&&(grades[i] <= 39)){
				counter30 ++;
			}
			if((grades[i] >= 40)&&(grades[i] <= 49)){
				counter40 ++;
			}
			if((grades[i] >= 50)&&(grades[i] <= 59)){
				counter50 ++;
			}
			if((grades[i] >= 60)&&(grades[i] <= 69)){
				counter60 ++;
			}
			if((grades[i] >= 70)&&(grades[i] <= 79)){
				counter70 ++;
			}
			if((grades[i] >= 80)&&(grades[i] <= 89)){
				counter80 ++;
			}
			if((grades[i] >= 90)&&(grades[i] <= 100)){
				counter90 ++;
			}
		}
		
		System.out.print(" 0-  9: ");
		for(int i = 0; i < counter0; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("10- 19: ");
		for(int i = 0; i < counter10; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("20- 29: ");
		for(int i = 0; i < counter20; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("30- 39: ");
		for(int i = 0; i < counter30; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("40- 49: ");
		for(int i = 0; i < counter40; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("50- 59: ");
		for(int i = 0; i < counter50; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("60- 69: ");
		for(int i = 0; i < counter60; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("70- 79: ");
		for(int i = 0; i < counter70; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("80- 89: ");
		for(int i = 0; i < counter80; i++){
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("90-100: ");
		for(int i = 0; i < counter90; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	//got any simpler way to do it?
}
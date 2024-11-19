import java.util.*;

class Exercise12_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index;
		
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i] = (int)(Math.random() * 1000);
		}
		
		while (true) {
			System.out.println("Please enter an array index (0 - 99): ");
			try {
				index = input.nextInt();
				if ((0 <= index) && (index < 100)) {
					System.out.println("The number at index " + index + " is: " + numbers[index]);
				}
				else {
					System.out.println("Out of Bounds.");
				}
			}
			catch (InputMismatchException ex) {
				System.out.println("Number must be an integer.");
				index = 0;
				input.nextLine();
			}
			System.out.println();
		}
	}
}
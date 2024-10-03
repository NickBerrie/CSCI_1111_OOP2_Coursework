import java.util.Scanner;

class Exercise11_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Side 1: ");
		double side1 = input.nextDouble();
		System.out.println();
		
		System.out.print("Side 2: ");
		double side2 = input.nextDouble();
		System.out.println();
		
		System.out.print("Side 3: ");
		double side3 = input.nextDouble();
		System.out.println();
		
		System.out.print("Color: ");
		String color = input.next();
		System.out.println();
		
		System.out.print("Filled: ");
		boolean filled = input.nextBoolean();
		System.out.println();
		
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Date Created: " + triangle.getDateCreated());
		System.out.println("Filled: " + triangle.isFilled());
	}
}
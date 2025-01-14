import java.util.Scanner;


public class Exercise13_01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Side 1: ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter Side 2: ");
		double side2 = input.nextDouble();
		
		System.out.print("Enter Side 3: ");
		double side3 = input.nextDouble();
		
		System.out.print("Enter Color: ");
		String color = input.next();
		
		System.out.print("Is Filled: ");
		boolean filled = input.nextBoolean();
		
		Triangle testTriangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println();
		System.out.println("Side 1 is: " + testTriangle.getSide1());
		System.out.println("Side 2 is: " + testTriangle.getSide2());
		System.out.println("Side 3 is: " + testTriangle.getSide3());
		System.out.println("Perimeter is: " + testTriangle.getPerimeter());
		System.out.println("Area is: " + testTriangle.getArea());
		System.out.println("Color is: " + testTriangle.getColor());
		System.out.println("Is Filled: " + testTriangle.isFilled());
	}
}
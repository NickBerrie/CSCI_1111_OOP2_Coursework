import java.awt.*;
import javax.swing.tree.*;

class Exercise09_01 {
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1 has Width: " + rect1.width + ", Height: " + rect1.height + ", Area: " + rect1.getArea() + ", and Perimeter: " + rect1.getPerimeter());
		System.out.println();
		System.out.println("Rectangle 2 has Width: " + rect2.width + ", Height: " + rect2.height + ", Area: " + rect2.getArea() + ", and Perimeter: " + rect2.getPerimeter());
	}
}

class Rectangle {
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newLength) {
		width = newWidth;
		height = newLength;
	}
	
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return (2 * height) + (2 * width);
	}
}
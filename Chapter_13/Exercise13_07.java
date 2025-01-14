import java.util.*;
import javax.sound.midi.*;

public class Exercise13_07 {
	public static void main(String[] args) {
		
		GeometricObject[] shapes = new GeometricObject[5];
		
		boolean valid = false;
		int tri_num = 0;
		
		while (tri_num <= 4) {
			int side1 = 0;
			int side2 = 0;
			int side3 = 0;
			int temp;
			valid = false;
			
			while (!valid) {
				side1 = (int)(Math.random() * 10);
				side2 = (int)(Math.random() * 10);
				side3 = (int)(Math.random() * 10);
				
				
				if ((side1 == 0) || (side2 == 0) || (side3 == 0)) {
					continue;
				}
				/*testing
				System.out.println(side1 + " " + side2 + " " + side3);
				System.out.println();
				*/
				
				if (side1 < side2) {
					if (side2 < side3) {
						temp = side1;
						side1 = side3;
						side3 = temp;
					}
					else {
						temp = side1;
						side1 = side2;
						side2 = temp;
					}
				}
				else if (side1 < side3) {
					if (side2 < side3) {
						temp = side1;
						side1 = side3;
						side3 = temp;
					}
					else {
						temp = side1;
						side1 = side2;
						side2 = temp;
					}
				}
				
				if (side1 < (side2 + side3)) {
					valid = true;
				}
			}
			
			shapes[tri_num] = new Triangle(side1, side2, side3);
			tri_num++;
			/* testing
			System.out.println(side1 + " " + side2 + " " + side3);
			System.out.println();
			System.out.println();
			*/
		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Area of Triangle " + (i+1) + ": %.2f", shapes[i].getArea());
			System.out.println();
			((Triangle)(shapes[i])).howToColor();
			System.out.println();
		}
	}
}
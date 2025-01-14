import java.lang.Math;

public class Octagon extends GeometricObject implements  Cloneable, Comparable<Octagon> {
	private double sides;
	double area;
	
	Octagon() {
		sides = 1;
		area = ((2 + (4 / Math.sqrt(2))) * sides * sides);
	}
	
	Octagon(double newSides) {
		sides = newSides;
		area = ((2 + (4 / Math.sqrt(2))) * sides * sides);
	}
	
	@Override
	public double getPerimeter() {
		return (sides * 8);
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (area > o.area) {
			return 1;
		}
		else if (area < o.area) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
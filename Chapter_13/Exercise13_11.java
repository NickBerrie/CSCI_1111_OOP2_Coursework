public class Exercise13_11 {
	public static void main(String[] args) {
		double side = ((double)((int)((Math.random() * 100))) / 10);
		
		Octagon octagon1 = new Octagon(side);
		
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		
		System.out.print("octagon1 == octagon2 = " + octagon1.compareTo(octagon2));
	}
}
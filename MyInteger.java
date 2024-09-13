import javax.print.attribute.standard.*;

public class MyInteger {
	int value;
	
	public MyInteger(int newValue) {
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isOdd() {
		if ((value % 2) == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isEven() {
		if ((value % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if ((value % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOdd(int number) {
		if ((number % 2) == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isEven(int number) {
		if ((number % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static  boolean isOdd(MyInteger number) {
		if ((number.value % 2) == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static boolean isEven(MyInteger number) {
		if ((number.value % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger number) {
		for (int i = 2; i < number.value; i++) {
			if ((number.value % 2) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int number) {
		if (value == number) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger number) {
		if (value == number.value) {
			return true;
		}
		else {
			 return false;
		}
	}
	
	public static int parseInt(char[] chars) {
		int numbers = Integer.parseInt(new String (chars));
		return numbers;
	}
	
	public static int parseInt(String chars) {
		int numbers = Integer.parseInt(chars);
		return numbers;
	}
}
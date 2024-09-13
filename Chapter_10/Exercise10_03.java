import java.util.*;
import java.awt.event.*;

public class Exercise10_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("number1 value: ");
		int num1 = input.nextInt();
		
		System.out.print("number2 value: ");
		int num2 = input.nextInt();
		
		MyInteger number1 = new MyInteger(num1);
		MyInteger number2 = new MyInteger(num2);
		
		System.out.println("number1's value is " + number1.getValue() + ".");
		System.out.println("number2's value is " + number2.getValue() + ".");
		System.out.println();
		
		if (number1.isOdd()) {
			System.out.println("number1 is odd.");
		}
		else {
			System.out.println("number1 is not odd.");
		}
		
		System.out.println();
		
		if(MyInteger.isOdd(number2)) {
			System.out.println("number2 is odd.");
		}
		else {
			System.out.println("number2 is not odd");
		}
		
		System.out.println();
		
		if (number1.isEven()) {
			System.out.println("number1 is even.");
		}
		else {
			System.out.println("number1 is not even.");
		}
		
		System.out.println();
		
		if (MyInteger.isEven(number2)) {
			System.out.println("number2 is even");
		}
		else {
			System.out.println("number2 is not even");
		}
		
		if (number1.isPrime()) {
			System.out.println("number1 is a prime number.");
		}
		else {
			System.out.println("number1 is not a prime number.");
		}
		
		System.out.println();
		
		if (MyInteger.isPrime(number2)) {
			System.out.println("number2 is a prime number.");
		}
		else {
			System.out.println("number2 is not a prime number.");
		}
		
		System.out.println();
		
		System.out.print("The integer ");
		int testNumOdd = input.nextInt();
		if (MyInteger.isOdd(testNumOdd)) {
			System.out.println("is an odd number.");
		}
		else {
			System.out.println("is not an odd number.");
		}
		
		System.out.println();
		
		System.out.print("The integer ");
		int testNumEven = input.nextInt();
		if (MyInteger.isEven(testNumEven)) {
			System.out.println("is an even number.");
		}
		else {
			System.out.println("is not an even number.");
		}
		
		System.out.println();
		
		System.out.print("The integer ");
		int testNumPrime = input.nextInt();
		if (MyInteger.isPrime(testNumPrime)) {
			System.out.println("is a prime number.");
		}
		else {
			System.out.println("is not a prime number.");
		}
		
		System.out.println();
		
		System.out.print("number1 equals: ");
		int number1Test = input.nextInt();
		if (number1.equals(number1Test)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
		
		System.out.print("number2 equals: ");
		int number2Test = input.nextInt();
		if (number2.equals(number2Test)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("False");
		}
		
		System.out.println();
		
		if(number1.equals(number2)) {
			System.out.println("number1 equals number2.");
		}
		else {
			System.out.println("number1 does not equals number2.");
		}
		
		System.out.println();
		
		char[] digits1 = {'1', '2', '3'};
		System.out.print("char[] digits1 is: ");
		System.out.println(MyInteger.parseInt(digits1));
		
		System.out.println();
		
		String digits2 = "123";
		System.out.print("String digits2 is: ");
		System.out.println(MyInteger.parseInt(digits2));
	}
}

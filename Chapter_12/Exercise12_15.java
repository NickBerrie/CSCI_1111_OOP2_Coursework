import java.io.*;
import java.util.*;
import javax.sound.midi.*;

public class Exercise12_15 {
	public static void main(String[] args) throws IOException{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		int rand_num;
		int[] numb_list = new int[100];
		Scanner read = new Scanner(file);
		
		for (int i = 1; i <= 100; i++) {
			rand_num = (int)((Math.random() * 100));
			output.print(rand_num);
			output.print(" ");
		}
		output.close();
		
		for (int i = 0; i < 100; i++) {
			int temp = read.nextInt();
			numb_list[i] = temp;
		}
		
		Arrays.sort(numb_list);
		
		for (int i = 0; i < 100; i++) {
			System.out.print(numb_list[i] + " ");
		}
		
	}
}
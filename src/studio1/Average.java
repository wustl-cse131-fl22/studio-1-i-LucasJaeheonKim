package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Type in the first of two integers you want to get the average of. ");
		int n1 = in.nextInt();
		
		System.out.println("Type in the other of two integers you want to get the average of. ");
		int n2 = in.nextInt();
		
		double average = (double) (n1 + n2) / 2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");
	}

}
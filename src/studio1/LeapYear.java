package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a year that you want to test if it is a leap year: ");
		int n1 = in.nextInt();

		boolean testLeapYear = (n1 % 4 == 0) && (n1 % 100 != 0) || (n1 % 400 == 0);
		System.out.println(n1 + " is a leap year: " + testLeapYear);
	}

}

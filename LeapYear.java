package org.test;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the year");
		int s = sc.nextInt();

		if (s % 4 == 0) {

			System.out.println(" Leap Year");
		} else {

			System.out.println("Not a Leap Year");
		}

	}

}

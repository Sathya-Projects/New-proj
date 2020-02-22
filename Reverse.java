package org.test;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please Enter the number:");
		int Rev = 0;
		int revnum = 0;
		int Q = 0;

		int a = s.nextInt();
		for (int i = 0; i < 3; i++) {

			Rev = a % 10;
			Q = a / 10;
			a = Q;
			System.out.print(Rev);

		}
	}

}

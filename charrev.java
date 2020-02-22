package org.test;

import java.util.Scanner;

public class charrev {

	public static void main(String[] args) {
		String revstring = "";
		Scanner s = new Scanner(System.in);

		System.out.println("Please Enter the number:");

		String str = s.nextLine();
		int size = str.length();

		for (int i = size - 1; i >= 0; i--) {

			revstring = revstring + str.charAt(i);

		}
		System.out.println(revstring);


	}

}

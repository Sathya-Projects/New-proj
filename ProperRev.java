package org.test;

import java.util.Scanner;

public class ProperRev {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Please Enter the number:");
		int rev = 0;

		int num = s.nextInt();
		while (num!=0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
			
			System.out.println(num);
		}
		System.out.println(rev);

	}

}

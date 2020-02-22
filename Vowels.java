package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Character:");
		String s1 = s.nextLine();

		Set<String> a = new HashSet();
		a.add("a");
		a.add("e");
		a.add("i");
		a.add("o");
		a.add("u");

		for (String i : a) {

			if (s1.equals(i)) {

				System.out.println("Vowels");
				break;

			} else {

				System.out.println("not a Vowel");
				break;

			}

		}

	}

}

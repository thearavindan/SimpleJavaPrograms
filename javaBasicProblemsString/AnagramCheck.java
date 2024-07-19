package javaBasicProblemsString;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input1 = input2.replaceAll("\\s", "").toLowerCase();
		
		char[] inputarray1 = input1.toCharArray();
		char[] inputarray2 = input2.toCharArray();
		
		Arrays.sort(inputarray1);
		Arrays.sort(inputarray2);
		
		if((inputarray1.length)==(inputarray2.length)) {
			if(Arrays.equals(inputarray1, inputarray2)) {
				System.out.println("The strings are anagrams.");
			}
		}else {
			System.out.println("The strings are not anagrams.");
		}
       scanner.close();
	}

}

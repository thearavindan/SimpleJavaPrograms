package javaBasicProblemsString;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInaString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for(char c : input.toCharArray()) {
			charSet.add(c);
		}
		
		 StringBuilder result = new StringBuilder();
	        for (char c : charSet) {
	            result.append(c);
	        }

	        String output= result.toString();
	        System.out.println(output);
	        
	        scanner.close();

	}

}

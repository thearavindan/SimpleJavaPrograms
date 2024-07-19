package javaBasicProblemsString;

import java.util.Scanner;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	
	input = input.replaceAll("\\s", "");
	
	System.out.println(input);
	
	scanner.close();
}
}

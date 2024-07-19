package javaBasicProblemsString;

import java.util.Scanner;

public class StringToIntegerConverstion {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = scanner.nextLine();
		
		input = input.replaceAll("[^0-9]", "");
		int num = Integer.parseInt(input);
		System.out.println(num);
		
	    scanner.close();

	}

}

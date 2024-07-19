package javaBasicProblemsString;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		if(reverse.equals(input)) {
			System.out.println("the given String is a palindrome");
		}else {
			System.out.println("the given string is not a palindrome");
		}
		scanner.close();
 }
}

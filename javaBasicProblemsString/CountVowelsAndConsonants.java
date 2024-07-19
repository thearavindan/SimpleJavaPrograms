package javaBasicProblemsString;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int vowels =0, consonants =0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("Number of Vowels in the given String is : "+vowels);
		System.out.println("Number of consonants in the given String is : "+consonants);
		
         scanner.close();
	}

}

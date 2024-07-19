package javaBasicProgramsArrays;

import java.util.Scanner;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraysize = scanner.nextInt();
		
	   int[] array = new int[arraysize];
	   
	   for(int i=0; i<array.length;i++) {
		   array[i] = scanner.nextInt();
	   }
	   
	   int sum=0;
	   for(int i=0;i<array.length;i++) {
		   sum+=array[i];
	   }
	   System.out.println(sum);
      scanner.close();
	}

}

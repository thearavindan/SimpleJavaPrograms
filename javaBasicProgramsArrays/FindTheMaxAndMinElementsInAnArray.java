package javaBasicProgramsArrays;

import java.util.Scanner;

public class FindTheMaxAndMinElementsInAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraysize = scanner.nextInt();
		
	   int[] array = new int[arraysize];
	   
	   for(int i=0; i<array.length;i++) {
		   array[i] = scanner.nextInt();
	   }
	   
	   int max = Integer.MIN_VALUE;
	   int min = Integer.MAX_VALUE;
	   
	   for(int num:array) {
		   if(num<min) {
			   min = num;
		   }
		   if(num>max) {
			   max=num;
		   }
	   }
	   System.out.println("Minimum Value is : "+min);
	   System.out.println("Maximum Value is : "+max);
	   
     scanner.close();
	}

}

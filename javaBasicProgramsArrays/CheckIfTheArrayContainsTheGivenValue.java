package javaBasicProgramsArrays;

import java.util.Scanner;

public class CheckIfTheArrayContainsTheGivenValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraysize = scanner.nextInt();
		
	   int[] array = new int[arraysize];
	   
	   for(int i=0; i<array.length;i++) {
		   array[i] = scanner.nextInt();
	   }
	   int value = scanner.nextInt();
	   boolean status =false;
	   
	   for(int i=0;i<array.length;i++) {
		   if(array[i]==value) {
			   System.out.println("true");
			   status = true; 
			   break;
		   }
	   }
	   if(!status) {
		   System.out.println("false");
	   }
		scanner.close();
	}

}

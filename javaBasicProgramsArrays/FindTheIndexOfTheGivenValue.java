package javaBasicProgramsArrays;

import java.util.Scanner;

public class FindTheIndexOfTheGivenValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array : ");
		int arraysize = scanner.nextInt();
		
		int[] a = new int[arraysize];
	   
	   System.out.println("Enter the values of the Array : ");
	   for(int i=0; i<a.length;i++) {
		   a[i] = scanner.nextInt();
	   }
	   
	   System.out.println("enter the value : ");
	   int value = scanner.nextInt();
	   boolean status = false;
	   
	   for(int i=0;i<a.length;i++) {
		   if(a[i]==value) {
			   System.out.println("The index of the "+value+" is :5 "+i);
			   status=true; break;
		   }
	   }
	   if(!status) {
		   System.out.println(-1);
	   }
		scanner.close();
	}

}

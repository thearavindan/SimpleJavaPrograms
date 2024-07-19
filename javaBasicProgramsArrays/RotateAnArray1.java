package javaBasicProgramsArrays;

import java.util.Scanner;

public class RotateAnArray1 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array : ");
		int arraysize = scanner.nextInt();
		
		int[] a = new int[arraysize];
	   
	   System.out.println("Enter the values of the Array : ");
	   for(int i=0; i<a.length;i++) {
		   a[i] = scanner.nextInt();
	   }
	   
	   System.out.println("enter the rotation value : ");
	   int k = scanner.nextInt();
	   

		for(int i=0;i<k;i++) {
			int temp = a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1] = temp;
		}
		System.out.println("After rotation : ");
		for(int num:a) {
			System.out.print(num+" ");
		}

	}

}

package _ProblemSolving;

import java.util.Scanner;

public class CheckingRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter a value");
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i]>Short.MIN_VALUE && arr[i]<Short.MAX_VALUE) {
				System.out.println("Short");
			}
			if(arr[i]>Byte.MIN_VALUE && arr[i]<Byte.MAX_VALUE) {
				System.out.println("Byte");
			}			
			if(arr[i]>Long.MIN_VALUE && arr[i]<Long.MAX_VALUE) {
				System.out.println("Long");
			}			
			if(arr[i]>Integer.MIN_VALUE && arr[i]<Integer.MAX_VALUE) {
				System.out.println("Integer");
			}
		}
		scanner.close();
		
	}
}

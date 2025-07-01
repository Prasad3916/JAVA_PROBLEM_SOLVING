package com.example.arrays;

import java.util.Arrays;

public class ArrayRotation {

	static int[] arrayRotation(int arr[],int n) {
		n=n%arr.length;
		if(n==arr.length) {
			return arr;	
		}
		for(int i=0;i<n;i++) {
			int temp=arr[0];
			int j;
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		String s=Arrays.toString(arrayRotation(new int[] {1,2,3,4,5},9));
		System.out.println(s);

	}

}

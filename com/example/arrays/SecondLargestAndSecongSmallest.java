package com.example.arrays;
public class SecondLargestAndSecongSmallest {
	static void lastButMinAndMax(int []arr) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(max<=arr[i+1]) {
				max=arr[i+1];
			}
			else if(min>=arr[i+1]) {
				min=arr[i+1];
			}
		}
		int secmax=arr[0];
		int secmin=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			if(secmax<=arr[j+1] && arr[j+1]!=max) {
				secmax=arr[j+1];
			}
			else if(secmin>=arr[j+1] && arr[j+1]!=min) {
				secmin=arr[j+1];
			}
		}
		System.out.println("Minimum Number "+min);
		System.out.println("Maximum Number "+max);
		System.out.println("Second Minimum Number "+secmin);
		System.out.println("Second Maximum Number "+secmax);
	}
	public static void main(String[] args) {
		int[]arr= {10,2,4,76,65,45,34,43,90,1};
		lastButMinAndMax(arr);
	}
}

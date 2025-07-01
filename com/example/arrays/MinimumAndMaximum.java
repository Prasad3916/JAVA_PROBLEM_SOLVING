package com.example.arrays;
public class MinimumAndMaximum {
//	void displayMinAndMax(int arr[]) {
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=0;i<arr.length-1;i++) {
//			if(max>=arr[i+1]) {
//				max=arr[i+1];
//			}
//			else if(min<=arr[i+1]) {
//				min=arr[i+1];
//			}
//		}
//		System.out.println("Minimum Value "+min);
//		System.out.println("Maximum Value "+max);
//	}
	void displayMinAndMax(int arr[]) {
		
		int max=arr[0];
		int secmax=arr[0];
		for(int i=0;i<arr.length-1;i++) {
				if(max<arr[i+1] && max!=arr[i+1]) {
					max=arr[i+1];
				}
		}
		for(int j=0;j<arr.length-1;j++) {
			if(secmax<=arr[j+1] && arr[j+1]!=max) {
				secmax=arr[j+1];
			}
		}
		System.out.println(secmax);
		for(int j=0;j<arr.length-1;j++) {
			if(secmax<=arr[j+1] && arr[j+1]!=max) {
				secmax=arr[j+1];
			}
		}
		System.out.println(secmax);
		
	}
	
	
	public static void main(String[] args) {
		new MinimumAndMaximum().displayMinAndMax(new int[] {-4,10,20,35,54,34,43,78,97,-1,54,900});
	}
}

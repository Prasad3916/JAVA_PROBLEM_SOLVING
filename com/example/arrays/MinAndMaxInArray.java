package com.example.arrays;
public class MinAndMaxInArray {
	static void minAndMaxInArray() {
		var arr=new int[] {200,287,277,276,265};
		var max=Integer.MIN_VALUE;
		var secmax=max;
		var min=Integer.MAX_VALUE;
		int secmin=min;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				secmax=max;
				max=arr[i];
			}
			if(secmax<arr[i] && max!=arr[i]) {
				secmax=arr[i];
			}
			if(min>arr[i]) {
				secmin=min;
				min=arr[i];
			}  
			if(secmin>arr[i] && min!=arr[i]) {
				secmin=arr[i];
			}
		}
		System.out.println(secmax);
		System.out.println(secmin);
		System.out.println(max); 
		System.out.println(min);
	}
	public static void main(String[] args) {
		minAndMaxInArray();
	}
}

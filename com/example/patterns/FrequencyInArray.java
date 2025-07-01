package com.example.patterns;

public class FrequencyInArray {
//	public static void frequencyInArray(int [] arr) {
//		boolean [] visited = new boolean[arr.length];
//		for(int i = 0 ; i < arr.length ; i++) {
//			int count = 1;
//			for(int j = i+1 ; j < arr.length ; j++) {
//				if(arr[i] == arr[j] ) {
//					count++;
////				arr[j] = -1;
//					visited[j] = true;
//				}
//			}
//			if(!visited[i]) {
//				System.out.println("Frequency of "+arr[i]+" is : "+count);
//			}
//		}
//	}
	public static void frequencyInArray(int [] arr) {
		boolean [] visited = new boolean[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			int count = 1;
			if(visited[i]) continue;
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] == arr[j] ) {
					count++;
					visited[j] = true;
				}
			}
			if(!visited[i]) System.out.println("Frequency of "+arr[i]+" is : "+count);
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,1,2,5,6};
		frequencyInArray(arr);
	}
}

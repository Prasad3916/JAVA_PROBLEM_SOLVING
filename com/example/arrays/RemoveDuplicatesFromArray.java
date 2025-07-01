package com.example.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	void removeDuplicates(int[] arr) {
		boolean[] visited = new boolean[arr.length];
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (!visited[i]) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						visited[j] = true;
					}
				}
				size += count;
			}
		}
		  int uniqueelements[]=new int[arr.length-size]; 
		  int index=0; 
		  for(int j=0;j<arr.length;j++) {
			  if(!visited[j]) {
				  uniqueelements[index++]=arr[j]; 
				  } 
			  }
//		  int index=0; 
//		  for(int j=0;j<arr.length;j++) {
//			  if(!visited[j]) {
//				 index++; 
//				  } 
//			  }
//		  int index1=0;
//		  int uniqueelements[]=new int[index]; 
//		 for(int k=0;k<arr.length;k++) {
//			 if(!visited[k]) {
//				 uniqueelements[index1++]=arr[k];
//			 }
//		 }
		System.out.println(size);
		System.out.println("Unique Elements " + Arrays.toString(uniqueelements));
	}
	public static void main(String[] args) {
		RemoveDuplicatesFromArray rd = new RemoveDuplicatesFromArray();
		rd.removeDuplicates(new int[] { 11, 1, 2, 1, 2, 3, 4, 5, 5, 4, 3, 6, 7, 7, 8, 9 });
	}
}

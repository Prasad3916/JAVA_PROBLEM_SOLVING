package com.example.ProblemSolving;

import java.util.Arrays;

public class ArrayRotation {
	
	void arrayRotation() {
		int count=0;
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {3,4,5,1,2};
		for(int i=0;i<arr1.length;i++) {
			if(arr1[0]==arr2[i]) {
				count=i;
			}
		}
		int dup=count-1;
		for(int i=0;i<arr2.length;i++) {  // 1 , 2 ,  3 , 4
//			for(int j=count;j<arr1.length;j++) {
				int temp=arr2[i];//3  4
				arr2[i]=arr2[count];
				arr2[dup]=temp;
			
		}
		System.out.println(Arrays.toString(arr2));
		
	}

	public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.arrayRotation();
	}

}

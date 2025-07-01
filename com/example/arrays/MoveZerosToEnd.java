package com.example.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	void moveZerosToEnd() {
				//[1,3,	12,0,0]
		int arr[]= {0,1,0, 3,12};
		int count=0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}			//3
		for(int i = count ; i < arr.length ; i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		new MoveZerosToEnd().moveZerosToEnd();
	}
}

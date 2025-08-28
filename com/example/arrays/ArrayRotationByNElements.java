 package com.example.arrays;
import java.util.Arrays;
public class ArrayRotationByNElements {
	void arrayRotationByNElements(int arr[],int n) {
		System.out.println("Before N Rotations"+Arrays.toString(arr));
		int iter=n%arr.length;
		if(iter==0) {
			System.out.println("After N Rotations"+Arrays.toString(arr));
			return;
		}
		else {
			for(int i=0;i<iter;i++) {
				int temp=arr[0],j;//1
				for(j=0;j<arr.length-1;j++) {
					arr[j]=arr[j+1]; //2 3 4 5
				}
				arr[j]=temp; // 2,3,4,5,1
			}
			System.out.println("After N Rotations"+Arrays.toString(arr));
			return;
		}
	}
	public static void main(String[] args) {
		ArrayRotationByNElements arrayRotationByNElements = new ArrayRotationByNElements();
		arrayRotationByNElements.
				arrayRotationByNElements(new int[] {1,2,3,4,5},11);
	}
}

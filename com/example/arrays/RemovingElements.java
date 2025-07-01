package com.example.arrays;
import java.util.Arrays;
public class RemovingElements {
	void removeElementsFromArray(int arr[]) {
		int removelement1=1;
		int removelement2=54;
		int count=0;
		for(int ele:arr) {
			if(ele==removelement1 || ele==removelement2) {
				count++;
			}
		}
		System.out.println(count);
		int index=0;
		int newarr[]=new int[arr.length-count];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=removelement1 && arr[i]!=removelement2) {
//				newarr[index++]=arr[i];
//			}
//		}
		for(int ele:arr) {
			if(ele!=removelement1 && ele!=removelement2) {
				newarr[index++]=ele;
			}
		}
		System.out.println(Arrays.toString(newarr));
	}
	public static void main(String[] args) {
		new RemovingElements().removeElementsFromArray(new int[] {12,34,54,1,-2,21,-9,12,34,1});
	}

}

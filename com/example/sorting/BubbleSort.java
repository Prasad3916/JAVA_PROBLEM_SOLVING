package com.example.sorting;
import java.util.Arrays;
public class BubbleSort {
	void BubbleSorting(int arr1[],int arr2[]) {
		int count=0;
		int count2=0;
		for(int i=0;i<arr1.length-1;i++) {
			boolean swap=false;
			boolean swap1=false;
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					swap=true;
				}
				if(arr2[j]<arr2[j+1]) {
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
					swap1=true;
//					System.out.println(++count2+" "+Arrays.toString(arr2));
				}
			}
			if(!swap)break;
			else if (!swap1)break;
		}
		System.out.println("Ascending Order "+Arrays.toString(arr1));
		System.out.println("Descending Order "+Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		int arr1[]= {10,20,4,12,67,54,23,1,56,8};
		int arr2[]= {10,20,4,12,67,54,23,1,56,8};
		BubbleSort bs=new BubbleSort();
		bs.BubbleSorting(arr1,arr2);
	}
}

package com.example.arrays;
import java.util.Arrays;
public class Sorting implements Comparable<Sorting>{
	static void arraySorting() {
		var arr=new int[] {32,12,5,12,76,54,12,34,2,1,45,89};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
						int temp=arr[j]; //12
						arr[j]=arr[i]; //32
						arr[i]=temp; //12
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		arraySorting();
		var arr=new int[] {32,12,5,12,76,54,12,34,2,1,45,89};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
}
	public int compareTo(Sorting o) {
		return 0;
	}
}
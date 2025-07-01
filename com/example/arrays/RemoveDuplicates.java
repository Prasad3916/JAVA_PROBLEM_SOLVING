package com.example.arrays;
import java.util.Arrays;
public class RemoveDuplicates {
	void removeDuplicates(int[]arr) {
		boolean visited[]=new boolean[arr.length];
		int size=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(!visited[i]) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
				size=size+count;	
			}
		}
		int remdup[]=new int[arr.length-size];
		int index=0;
		for(int j=0;j<arr.length;j++) {
			if(!visited[j]) {
				remdup[index++]=arr[j];
			}
		}
		System.out.println(Arrays.toString(remdup));
	}
	public static void main(String[] args) {
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.removeDuplicates(new int[] {1 ,3,1,1,2,3,2,1,5,3,2,1,3,4,10,20});
		}
}

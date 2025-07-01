package com.example.strings;
public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
;		int arr[]= {1,1,1,2,2,3,4,4,4,5,5,5};
		for(int ele:arr) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(ele==arr[i]) {
					count++;
					arr[i]=0;
				}
			}
			if(ele!=0)
					System.out.println("Frequency Of "+ele+" In Given Array "+(count));
		}
	}
}

package com.example.arrays;

public class PeakElement {
	
	void peakElement() {
		
		int []arr = {1,3,20,4,6,0};
		int peak=0;
		for(int i=1;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1] && arr[i]>arr[i-1] &&peak<arr[i]) {
				peak=arr[i];
			}
			
		}
		System.out.println(peak);
	}

	public static void main(String[] args) {
		new PeakElement().peakElement();
		
	}
}

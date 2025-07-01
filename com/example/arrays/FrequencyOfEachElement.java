package com.example.arrays;
public class FrequencyOfEachElement {
	void getElementFrequency(int[]arr) {
		boolean visited[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(!visited[i]) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=true;
					}
				}
				System.out.println(arr[i]+" >>> "+count);
			}
		}
	}
//	void getElementFrequency(int arr[]) {
//		boolean visited[]=new boolean[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			if(!visited[i]) {
//				 int count=1;
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i]==arr[j]) {
//						count++;
//						visited[j]=true;
//					}
//				}
//				System.out.println(arr[i]+">>>"+count);
//			}
//		}
//	}
	public static void main(String[] args) {
		FrequencyOfEachElement fe=new FrequencyOfEachElement();
		fe.getElementFrequency(new int[] {2,4,2,1,3,4,5,2,3,1,5,7,4});
	}
}

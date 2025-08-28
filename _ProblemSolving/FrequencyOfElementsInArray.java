package _ProblemSolving;

import java.util.ArrayList;

public class FrequencyOfElementsInArray {
	static void frequencyOfElementsInArray() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		var arr= new int[]{1,2,3,4,
				5,1,2,3,1,1,15,6,2,7,7,8,8,9,0,0,1,1,1,2,3,4,5,6,11,12,3,4,5,6,10111,11,1111,12,1,1,21,1,1,5,4};
		var flag=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(!flag[i]) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						flag[j]=true;
					}
				}
					arrayList.add(arr[i]);
//					System.out.println(arr[i]+" "+count);
			}
		}
		System.out.println(arrayList);
	}
	public static void main(String[] args) {
		frequencyOfElementsInArray();
	}
}

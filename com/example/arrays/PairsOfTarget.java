package com.example.arrays;

public class PairsOfTarget {

	
	
	void pairsOfTarget() {
		
		String sum="(";
		int target=6;
		int data[]= {1,5,7,-1,5};
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if(data[i]+data[j]==target) {
					sum+="("+data[i]+","+data[j]+"),";
				}
			}
		}
		sum+=")";
		int index=sum.lastIndexOf(",");
		StringBuilder str=new StringBuilder(sum);
		str.replace(index, index+1,"");
		System.out.println(str);

		
	}
	
	public static void main(String[] args) {
		new PairsOfTarget().pairsOfTarget();
	}
}

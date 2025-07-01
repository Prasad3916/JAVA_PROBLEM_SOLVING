package com.example.arrays;
public class MatrixFinding {
	static String matrixFinding(int arr[][]) {
		boolean flag=true;
		String status="";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i][j]!=0) {
					flag= false;
					break;
				}
			}
		}
		if(flag) {
			for(int i=0;i<arr.length;i++) {
				int commonValue=arr[0][0];
				for(int j=0;j<arr.length;j++) {
					if(i==j && arr[i][j]==1) {
						status= "Unit Matrix";
					}
					else if(i==j && arr[i][j]!=commonValue) {
						status= "Diagonal Matrix";
					}
					else{
						status= "Scalar Matrix";
					}
				}
			}
		}
		return status;
	}
	public static void main(String[] args) {
		int arr[][]= {
				{10,0,0},
				{0,11,0},
				{0,0,10}
				};
		System.out.println(matrixFinding(arr));
	}
}

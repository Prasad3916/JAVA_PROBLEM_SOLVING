package com.example.arrays;
public class SumOfEvenAndOddIndexValues {
	void sumOfEvenAndOddIndexValues(int arr[]) {
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
}
		System.out.println("Sum Of Even Numbers "+evensum);
		System.out.println("Sum Of Odd Numbers "+oddsum);
	}
	public static void main(String[] args) {
		new SumOfEvenAndOddIndexValues().sumOfEvenAndOddIndexValues(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

}

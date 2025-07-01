package com.example.ProblemSolving;

public class OddNumbers {
	
	void displayOddNumbers(int n) {
		System.out.println("Odd Numbers : ");
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		OddNumbers on =new OddNumbers();
		on.displayOddNumbers(50);
	}

}

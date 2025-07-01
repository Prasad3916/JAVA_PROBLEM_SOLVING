package com.example.ProblemSolving;
public class SumOffDigitsInANumber {
	void diplaySumOfDigitsInANumber(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum Of Digits In a Number "+sum);
	}
	public static void main(String[] args) {
		SumOffDigitsInANumber sumOffDigitsInANumber = new SumOffDigitsInANumber();
		sumOffDigitsInANumber.diplaySumOfDigitsInANumber(653763);
	}
}

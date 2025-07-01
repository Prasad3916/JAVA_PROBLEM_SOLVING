package com.example.ProblemSolving;
public class SumOfOddNumbers {
	int sum;
	int count;
	void displaySumOfOddNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("Count : "+count);
		System.out.println("Sum Off Odd Numbers : "+sum);
	}
	public static void main(String[] args) {
		SumOfOddNumbers sod=new SumOfOddNumbers();
		sod.displaySumOfOddNumbers(100);
		System.out.println("Sum Off Odd Numbers : "+Math.pow(sod.count, 2));
	}
}

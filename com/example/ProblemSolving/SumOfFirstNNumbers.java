package com.example.ProblemSolving;

public class SumOfFirstNNumbers {
	int number;
	void displayOfFirstNNumbers(int n) {
		number=n;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum Of First N Numbers "+sum);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFirstNNumbers sumOfFirstNNumbers = new SumOfFirstNNumbers();
		sumOfFirstNNumbers.displayOfFirstNNumbers(100);
		System.out.println("Sum Of First N Numbers "+((sumOfFirstNNumbers.number*(sumOfFirstNNumbers.number+1))/2));

	}

}

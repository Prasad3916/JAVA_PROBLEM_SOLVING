package com.example.ProblemSolving;

public class FibonacciSeries {
	
	void fibonacciSeries(int n) {
		int first=5;
		int second=10;
		System.out.print("Fibonacci Series : ");
		while(first<=n) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
			
			
			
			
			
			
			
			
			
			
			
			
//            System.out.print(first + " ");
//            int next = first + second;
//            first = second;
//            second = next;
		}
	}
	
	
    public static void main(String[] args) {
    	new FibonacciSeries().fibonacciSeries(73);
    }
}

package _50DSAProblemSolving.com.exam;

import java.util.Scanner;

public class Exam3 {
	
	static boolean isPrime(int n) {
		if(n<1) {
			return true;
		}
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int start=scanner.nextInt();
		System.out.println("Enter 2nd Number");
		int end=scanner.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count+=1;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}

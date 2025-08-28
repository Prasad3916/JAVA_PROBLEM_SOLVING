package _50DSAProblemSolving.com.exam;

import java.util.Scanner;

public class Exam2 {
	static boolean getStrongNumber(int num)
	{
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int mul=1;
			for(int i=1;i<=rem;i++) {
				mul*=i;
			}
			sum+=mul;
			num/=10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scanner.nextInt();
		for (int i = 100; i<=n; i++) {
			if(getStrongNumber(i)) {
				System.out.println(i);
			}
		}
		
		
		scanner.close();

	}
}

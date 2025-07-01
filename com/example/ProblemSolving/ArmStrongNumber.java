package com.example.ProblemSolving;
public class ArmStrongNumber {
	static int count(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
	static int power(int num,int power) {
		int sum=1;
		for(int i=1;i<=power;i++) {
			sum*=num;
		}
		return sum;
	}
	static boolean isArmStrongNumber(int num) {
		int temp=num;
		int sum=0;
		int iterations=count(num);
		while(num!=0) {
			int rem=num%10;
			sum+=power(rem,iterations);
			num=num/10;
		}
		return temp==sum;
	}

	public static void main(String[] args) {

		for(int i=1;i<=1000;i++) {
			if(isArmStrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

}

package com.example.ProblemSolving;
public class ArmStrongNumber1 {
	int getCount(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	boolean isArmStrongNumber(int n) {
		int temp=n;
		int sum=0;
		int i=getCount(n);
		while(n!=0) {
			int rem=n%10;
			sum+=Math.pow(rem, i);
			n=n/10;	
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		ArmStrongNumber1 armStrongNumber1 = new ArmStrongNumber1();
		for(int i=1;i<=1000;i++) {
			if(armStrongNumber1.isArmStrongNumber(i)){
				System.out.println(i);
			}
		}
	}
}

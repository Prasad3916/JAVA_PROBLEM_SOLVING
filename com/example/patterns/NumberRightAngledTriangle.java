package com.example.patterns;
public class NumberRightAngledTriangle {
	static void NumberPattern1(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void NumberPattern2(int n) {
		int count=1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");	
				count++;
			}
			System.out.println();
		}}
	static void Pattern3(int num) {
		for(int i=1;i<=num;i++) {
				System.out.println((" ".repeat(num-i)+"*".repeat(i)));
		}
	}
	static void Pattern4(int num) {
		for(int i=1;i<=num;i++) {
			if(i==1 || i==num) {
				System.out.println("*".repeat(num));
			}
			else {
//				String s=" ";
//				for(int k=1;k<=num-2;k++) {
//					s+=" ";
//				}
					System.out.println("*"+" ".repeat(num-2)+"*");
			}
		}
	}
//		for(int i=0;i<num;i++) {
//			for(int j=0;j<num;j++) {
//				if(i==0 || i==num-1 || j==0 || j==num-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
	static void Pattern5(int num) {
		for(int i=1;i<=num;i++) {
				System.out.println("*".repeat(i));
		}
		for(int j=num-1;j>=1;j--) {
			System.out.println("*".repeat(j));
		}
	}
	static void Pattern6(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("-------Pattern 1-------");
		NumberPattern1(5);
		System.out.println("-------Pattern 2-------");
		NumberPattern2(5);
		System.out.println("-------Pattern 3-------");
		Pattern3(5);
		System.out.println("-------Pattern 4-------");
		Pattern4(5);
		System.out.println("-------Pattern 5-------");
		Pattern5(5);
		System.out.println("-------Pattern 6-------");
		Pattern6(5);
	}
}
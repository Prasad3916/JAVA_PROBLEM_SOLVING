package com.example.patterns;
public class Example1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print((i+j+1)%2);
				}
				else {
					System.out.print((i+j+1)%2);
				}
			}
			System.out.println();
		}
	}
}

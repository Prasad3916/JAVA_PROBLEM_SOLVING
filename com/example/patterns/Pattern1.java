package com.example.patterns;
public class Pattern1 {
	void  patternPrinting(int n) {
		for (int i=1;i<=n;i++) {
			if(i<n) {
				System.out.println("* ".repeat(i));
			}
			else {
				for(int j=n;j>=1;j--) {
					System.out.println("* ".repeat(j));
				}
			}
		}
	}
	public static void main(String[] args) {
		new Pattern1().patternPrinting(5);
	}
}

package com.example.strings;
import java.util.Scanner;	
public class LowerCaseToUpperCaseAndUpperCaseToLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character To Convert Lower Case To Upper Case Or Upper Case To Lower Case : ");
		char c=sc.next().charAt(0);
		int i=32;
		if((int)c>92) {
			System.out.println("Character Is Convertd To Upper Case : ");
			System.out.println((char)(((int) c)-i));
		}
		else {
			System.out.println("Character Is Convertd To Upper Case : ");
			System.out.println((char)(((int) c)+i));
		}
		sc.close();
	}
}

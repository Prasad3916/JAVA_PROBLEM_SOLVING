package com.example.strings;
import java.util.Scanner;
public class StringToAsciiValues {
	public static void main(String[] args) {
		System.out.println("Enter a String To Get Ascii Values Of Characters");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			System.out.println("Ascill Value Of "+str.charAt(i)+" is : "+((int)str.charAt(i)));
		}
		sc.close();
	}
}

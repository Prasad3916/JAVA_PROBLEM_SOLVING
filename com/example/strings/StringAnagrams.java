package com.example.strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringAnagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1=sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2=sc.nextLine();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length || !Arrays.equals(ch1, ch2)) {
			System.out.println("Given Strings Are Not Anagrams");
		}
		else {
			System.out.println("Given Strings Are Anagrams");
		}
}
}

package com.example.strings;
import java.util.Scanner;
public class CheckingStringPalidromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String To Reverse : ");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int start=0; 
		int end=c.length-1; 
		while(start<end) {
			char temp=c[start]; 
			c[start]=c[end]; 
			c[end]=temp; 
			start++;
			end--;
		}
//		System.out.println(s);
//		System.out.println(new String(c));
		if(s.equals(new String(c))) 
			System.out.println("Given String Is a Palidrome");
		
		else
			System.out.println("Given String Is Not a Palidrome");
		sc.close();
	}
}

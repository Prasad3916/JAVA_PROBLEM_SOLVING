package com.example.strings;
import java.util.Scanner;
public class CheckingStringContainsDigitsAreNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		boolean flag=true;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			flag=Character.isDigit(ch[i]);
			if(flag==false) {
				System.out.println("Given String Contains Other Than Digits Also");
				break;
			}
			else {
				System.out.println("Given String Contains Digits Only");
				break;
			}
		}
		sc.close();
	}
}

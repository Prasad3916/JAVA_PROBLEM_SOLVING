package com.example.strings;

public class RomamToInteger {
	
	
	static void romanToInteger(){
		
		String str="CMXCIX".toLowerCase();
		int num=0;
		int i=1;
		int v=5;
		int x=10;
		int l=50;
		int c=100;
		int d=500;	
		int m=1000;
		
		for (int j = 0; j < str.length(); j++) {
			
			
			if(str.charAt(j)=='i') {
				if(j!=str.length()-1 && str.charAt(j+1)=='v') {
					num+=(v-i);
					j++;
				}
				else if(j!=str.length()-1 && str.charAt(j+1)=='x') {
					num+=(x-i);
					j++;
				}
				else {
					num+=i;
				}
			}
			else if(str.charAt(j)=='x') {
				if(j!=str.length()-1 && str.charAt(j+1)=='l') {
					num+=(l-x);
					j++;
				}
				else if(j!=str.length()-1 && str.charAt(j+1)=='c') {
					num+=(c-x);
					j++;
				}
				else {
					num+=x;
				}
			}
			else if(str.charAt(j)=='c') {
				if(j!=str.length()-1 && str.charAt(j+1)=='d') {
					num+=(d-c);
					j++;
				}
				else if(j!=str.length()-1 && str.charAt(j+1)=='m') {
					num+=(m-c);
					j++;
				}
				else {
					num+=c;
				}
			}
			
			else if(str.charAt(j)=='v') {
				num+=v;
			}
			else if(str.charAt(j)=='l') {
				num+=l;
			}			
			else if(str.charAt(j)=='d') {
				num+=d;
			}
			else if(str.charAt(j)=='m') {
				num+=m;
			}
		}

		
		System.out.println(num);

		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		romanToInteger();
		
	}
}

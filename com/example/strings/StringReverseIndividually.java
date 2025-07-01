package com.example.strings;
import java.util.Scanner;
public class StringReverseIndividually {
	 public static void main(String[] args) {
		 System.out.println("Enter String To Reverse Each Word : ");
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 str=str+" ";
		 char arr[]=str.toCharArray();
		 int start=0;
		 int end=0;;
		 for(int i=0;i<arr.length;i++) {  // ['h','e','l','l','o',' ','w','o','r','l','d',' ']
			 if(arr[i]==' ') {
				 end=i-1; //4 
				 int start1=start; //0
				 for(;start<i;start++) { //5-0,1,2,3,4
					 while(start1<end) {
						 char temp=arr[start1];
						 arr[start1]=arr[end];
						 arr[end]=temp;
						 end--;
						 start1++;
					 }	 
				 }
				 start++;
			 }
		 }
		 System.out.println(new String(arr).trim());
		 sc.close();
	}
}
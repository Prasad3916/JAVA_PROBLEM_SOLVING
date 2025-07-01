package com.example.arrays;
import java.util.Scanner;
class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        System.out.println("----------------");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int aw=sc.nextInt();
       sc.nextLine();
       int den[]=new int[5];
        den[0]=sc.nextInt();
        den[1]=sc.nextInt();
        den[2]=sc.nextInt();
        den[3]=sc.nextInt();
        den[4]=sc.nextInt();
        if(aw%100!=0) {
        	System.out.println("---------");
        	return;
        }
        if(aw>n) {
        	System.out.println("------38763-----");
        	return;
        }
        int[] notescount=new int[5];
        int rm=aw;
        for(int i=den.length-1;i>=0;i--) {
        	
        }
        sc.close();
    }
}
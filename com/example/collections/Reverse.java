package com.example.collections;

import java.util.Vector;

public class Reverse {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		System.out.println(vector);
		int start=0;
		int end=vector.size()-1;
		
		while(start<end) {
			int temp=vector.get(start);
			vector.set(start,vector.get(end));
			vector.set(end, temp);
			start++;
			end--;
			
		}
		
		System.out.println(vector);
		
	
	}
}

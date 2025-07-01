package com.example.collections;

import java.util.Vector;

public class Check_Element_Existence {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		System.out.println(vector.indexOf(105)>=0?vector.indexOf(10):"Not Found");

	}

}

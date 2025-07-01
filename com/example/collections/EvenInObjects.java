package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;

//class Employee {
//	String name;
//	int age;
//	public Employee(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", age=" + age + "]";
//	}
//}

public class EvenInObjects {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(65,24,34,45,67,67,86,102,98));
//		System.out.println(al.size());
		Object[] li=al.toArray();
		for(int i=0;i<li.length;i++) {
			if((Integer)li[i]%2==1) {
				System.out.print((Integer)li[i]+" ");
			}
		}
	}
}

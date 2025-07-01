package com.example.collections;
import java.util.ArrayList;
public class EvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(10);
		arrayList.add(36);
		arrayList.add(37);
		arrayList.add(26);
		arrayList.add(87);
		arrayList.add(37);
		arrayList.add(38);
		arrayList.add(98);
		arrayList.add(36);
		arrayList.add(79);
		arrayList.add(35);
		System.out.println(arrayList);
		for (Integer integer : arrayList) {
			if(integer%2==0)
			System.out.println(integer);
		}
	}
}

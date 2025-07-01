package com.example.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveMultiplesOfThree {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(18);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(42);
		arrayList.add(50);
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()%3==0) {
				iterator.remove();
			}
		}
		System.out.println(arrayList);
	}
}

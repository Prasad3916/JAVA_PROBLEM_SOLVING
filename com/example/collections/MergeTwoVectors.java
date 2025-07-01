package com.example.collections;

//import java.util.Iterator;
import java.util.Vector;

public class MergeTwoVectors {

		public static void main(String[] args) {
			Vector<String> vector = new Vector<>();
			Vector<String> vector2 = new Vector<>();
			vector.add("CSS");
			vector.add("JSP");
			vector.add("Java");
			vector.add("Python");
			vector.add("Spring");
			vector2.add("Js");
			vector2.add("C");
			vector2.add("C++");
			vector2.add("React");
			vector2.add("HTML");
			for (String string : vector2) {
				vector.add(string);
			}
			System.out.println(vector);
			
		}
}

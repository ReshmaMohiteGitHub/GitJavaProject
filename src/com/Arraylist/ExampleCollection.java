package com.Arraylist;

import java.util.ArrayList;

public class ExampleCollection {
	public static void main(String [] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.stream().forEach(x->System.out.println(x));
	}

}

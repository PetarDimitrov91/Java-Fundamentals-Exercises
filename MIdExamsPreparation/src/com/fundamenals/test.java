package com.fundamenals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		int index = 4;
		int radius = 2;


		for (int i = index - radius; i <= index + radius; i++) {
			list.set(i, 0);
		}
		list.removeAll(Collections.singleton(0));


		System.out.println(list.toString());

	}
}

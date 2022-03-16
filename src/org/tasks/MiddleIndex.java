package org.tasks;

import java.util.ArrayList;
import java.util.List;

public class MiddleIndex {

	public static void main(String[] args) {

		List li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		li.add(110);
		
		int size = li.size()/2;
		
		System.out.println(li.get(size));

	}

}

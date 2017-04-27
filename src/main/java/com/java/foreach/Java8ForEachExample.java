package com.java.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		// creating sample Collection
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// traversing using Iterator
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator Value ::" + it.next());
		}

		// traversing through forEach method of Iterable with anonymous class
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("ForEach ananomous class value ::" + t);

			}

		});
		// traversing with Consumer interface implementation
		Myconsumer consumer = new Myconsumer();
		list.forEach(consumer);
	}

}
//// Consumer implementation that can be reused

class Myconsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);

	}

}

package hr.fer.oop.zad1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Iterator<Integer> iterator = new FibonacciIterator(10);
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}

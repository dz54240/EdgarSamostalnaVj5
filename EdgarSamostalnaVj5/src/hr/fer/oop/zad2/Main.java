package hr.fer.oop.zad2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("printing:");
		Iterator<Integer> iterator = new FactorialIterator(10);
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
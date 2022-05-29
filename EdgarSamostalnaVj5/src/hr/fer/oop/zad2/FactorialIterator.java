package hr.fer.oop.zad2;

import java.util.Iterator;
import java.util.NoSuchElementException;

class FactorialIterator implements Iterator<Integer> {

	private int generetedNumbers;
	private int amount;
	private int[] factorial;


	public FactorialIterator(int amount) {
		if(amount < 0) throw new IllegalArgumentException();
		this.amount = amount;
		this.generetedNumbers = 0;
		this.factorial = new int[amount];
		for(int i=0;i<amount;i++) {
			this.factorial[i] = getFactorialNum(i);
		}
	}

	private int getFactorialNum(int n) {
		int value = 1;
		if(n == 0) return 1;
		else 
			for(int i=1;i<=n;i++) {
				value *= i;
			}
		return value;
	}

	@Override
	public boolean hasNext() {
		if(generetedNumbers != amount) return true;
		return false;
	}

	@Override
	public Integer next() {
		if(!hasNext()) throw new NoSuchElementException();
		generetedNumbers++;
		return this.factorial[generetedNumbers-1];
	}
}

package hr.fer.oop.zad1;

import java.util.Iterator;
import java.util.NoSuchElementException;

class FibonacciIterator implements Iterator<Integer> {
	private int generetedNumbers;
	private int amount;
	private int[] fibonaci;
	
	public FibonacciIterator(int amount) {
		if(amount < 0) throw new IllegalArgumentException();
		this.generetedNumbers = 0;
		this.amount = amount;
		this.fibonaci = new int[amount];
		if(amount == 1) {
			this.fibonaci[0] = 0;
		}else if(amount == 2) {
			this.fibonaci[0] = 0;
			this.fibonaci[1] = 1;
		}else if(amount > 2) {
			this.fibonaci[0] = 0;
			this.fibonaci[1] = 1;
			this.fibonaci[2] = 1;
			for(int i=3;i<amount;i++) {
				this.fibonaci[i] = this.fibonaci[i-2] + this.fibonaci[i-1];
			}
		}
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
		return this.fibonaci[generetedNumbers-1];
	}
}

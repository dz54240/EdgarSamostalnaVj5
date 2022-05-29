package hr.fer.oop.zad4;

import java.util.*;
import java.util.function.Predicate;

class Solution {


	public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar){
		return new Predicate<List<List<Integer>>>() {

			String num = String.valueOf(exemplar);
			String[] split = num.split("\\.");
			String whole = split[0];
			String decimal = split[1];
			LinkedList<Integer> indexNum = new LinkedList<>();

			@Override
			public boolean test(List<List<Integer>> t) {
				// dodali smo cijelu broj u listu
				indexNum.add(Integer.parseInt(whole));
				// dodajemo decimalne brojeve u listu
				for(int i=0;i<decimal.length();i++) {
					indexNum.add(Character.getNumericValue(decimal.charAt(i)));
				}

				for(List<Integer> list : t) {
					if(list.size() != 2) return false;
					int index = list.get(0);
					int value = list.get(1);
					if(index > indexNum.size()-1) {
						int lastInd = indexNum.size()-1;
						if(indexNum.get(lastInd) == value) return true;
					}
					if(indexNum.get(index) != value) return false;
				}
				return true;
			}
		};
	}


	public static Predicate<List<List<Integer>>> allDigitsDefined(){
		return new Predicate<List<List<Integer>>>() {


			@Override
			public boolean test(List<List<Integer>> t) {
				int size = t.size();
				int[] arr = new int[size];
				
				// punimo polje sa vrijednostima na svakom indexu
				for(List<Integer> list : t) {
					int index = list.get(0);
					int value = list.get(1);
					try {
						arr[index] = value;
					}catch(IndexOutOfBoundsException e) {
						return false;
					}
				}
				for(List<Integer> list : t) {
					int index = list.get(0);
					int value = list.get(1);
					if(arr[index] != value) return false;
				}
				return true;
			}
		};
	}
}

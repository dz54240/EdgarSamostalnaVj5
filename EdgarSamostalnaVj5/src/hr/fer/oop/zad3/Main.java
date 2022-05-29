package hr.fer.oop.zad3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(CollectionUtil.myFilterReduce(Arrays.asList("fer", "oop", "java", "javadoc"),
	            "both begin with j.",
	            x -> x.startsWith("j"),
	            (x,y) -> y + " " + x));
		
	}

}

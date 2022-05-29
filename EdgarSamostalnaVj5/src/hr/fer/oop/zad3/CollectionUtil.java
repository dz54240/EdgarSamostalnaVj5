package hr.fer.oop.zad3;

import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

class CollectionUtil {
	
	public static <T> T myFilterReduce(Collection<T> coll, T init, Predicate<T> pred, BinaryOperator<T> op) {
		if(coll == null) throw new NullPointerException();
		if(coll.size() == 0) return init;
		
		for(T obj : coll) {
			if(pred.test(obj))
				init = op.apply(init, obj);
		}
		
		return init;
	}
}

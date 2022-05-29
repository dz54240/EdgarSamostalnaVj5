package hr.fer.oop.zad5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class MyPlayer extends Player implements Iterable<Game> {

	TreeMap<Game, LinkedList<Integer>> map;
	
	protected MyPlayer(String name) {
		super(name);
		map = new TreeMap<>();
	}

	@Override
	void addGameScore(Game game, int score) {
		if(map.get(game) == null) {
			map.put(game, new LinkedList<>());
			map.get(game).add(score);
		} else {
			map.get(game).add(score);
		}
	}

	@Override
	Iterable<Integer> getScores(Game game) {
		return map.get(game);
	}

	@Override
	public Iterator<Game> iterator() {
		return map.keySet().iterator();
	}
}

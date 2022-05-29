package hr.fer.oop.zad5;

public abstract class Player {
	private String name;

	protected Player(String name) {
		this.name = name;        
	}    

	public String getName() {
		return name;
	}

	abstract void addGameScore(Game game, int score);

	abstract Iterable<Integer> getScores(Game game);
}

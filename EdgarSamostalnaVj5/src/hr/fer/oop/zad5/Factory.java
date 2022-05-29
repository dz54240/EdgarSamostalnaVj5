package hr.fer.oop.zad5;

class Factory extends Game implements Comparable<Game> {

	protected Factory(String name) {
		super(name);
	}

	static Game createGame(String string, int i) {
		Game gejm = new Factory(string);
		gejm.setRating(i);
		return gejm;
	}

	@Override
	public int compareTo(Game o) {
		return this.getName().compareTo(o.getName());
	}
}

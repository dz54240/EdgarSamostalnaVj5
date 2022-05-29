package hr.fer.oop.zad6;


public class Zapis implements Comparable<Zapis> {
	String ime;
    Integer bodovi;
    
    public Zapis(String ime, Integer bodovi) {
    	this.ime = ime;
    	this.bodovi = bodovi;
    }
    
    
    public String toString() {
        return this.ime + ":" + this.bodovi;
    }

	@Override
	public int compareTo(Zapis o) {
		return this.ime.compareTo(o.ime);
	}

	@Override
	public int hashCode() {
		return ime.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Zapis)) return false;
		Zapis other = (Zapis)obj;
		return this.ime.equals(other.ime);
	}   
}

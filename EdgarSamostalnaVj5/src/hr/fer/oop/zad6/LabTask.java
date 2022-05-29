package hr.fer.oop.zad6;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class LabTask {
	public static Collection<Zapis> readData() {
		Scanner sc = new Scanner(System.in);
		TreeSet<Zapis> set = new TreeSet<>();
		String text;
		while(!(text = sc.nextLine()).equals("quit")) {
			String[] split = text.split("#");
			String name = split[0];
			String points = split[1];
			
			Zapis current = new Zapis(name, Integer.parseInt(points));
			if(set.contains(current)) {
				set.remove(current);
				set.add(current);
			}else {
				set.add(current);
			}
		}
		sc.close();
		return set;
	}
}

package exerciceArrayList;

import java.util.ArrayList;

public class Exercice15 {

	// 15. Ecrire un programme Java pour joindre deux arraylists.
	public static void main(String[] args) {

		ArrayList poissons = new ArrayList();
		
		poissons.add("Sole");
		poissons.add("Poisson rouge");
		poissons.add("N�mo");
		poissons.add("Anguille");
		poissons.add("Etoile de mer");
		
		
		ArrayList num�ro = new ArrayList();
		
		num�ro.add(3);
		num�ro.add(15);
		num�ro.add(65);
		num�ro.add(120);
		num�ro.add(300);
		
		
		System.out.println(poissons);
		System.out.println(num�ro);
		num�ro.addAll(poissons);
		
		System.out.println(num�ro);
		
	}

}

package exerciceArrayList;

import java.util.ArrayList;

public class Exercice15 {

	// 15. Ecrire un programme Java pour joindre deux arraylists.
	public static void main(String[] args) {

		ArrayList poissons = new ArrayList();
		
		poissons.add("Sole");
		poissons.add("Poisson rouge");
		poissons.add("Némo");
		poissons.add("Anguille");
		poissons.add("Etoile de mer");
		
		
		ArrayList numéro = new ArrayList();
		
		numéro.add(3);
		numéro.add(15);
		numéro.add(65);
		numéro.add(120);
		numéro.add(300);
		
		
		System.out.println(poissons);
		System.out.println(numéro);
		numéro.addAll(poissons);
		
		System.out.println(numéro);
		
	}

}

package exerciceArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercice10 {

	// Ecrire un programme Java pour m�langer les �l�ments dans une arraylist.
	public static void main(String[] args) {
		ArrayList<Double> taille = new ArrayList<Double>();
		
		taille.add(1.70);
		taille.add(1.50);
		taille.add(1.72);
		taille.add(1.55);
		taille.add(1.80);
		
		// La m�thode shuffle permet de m�langer une ArrayList
		Collections.shuffle(taille);
		
		System.out.println(taille);
	}

}

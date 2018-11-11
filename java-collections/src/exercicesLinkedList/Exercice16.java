package exercicesLinkedList;

import java.util.Collections;
import java.util.LinkedList;

// 16. Ecrire un programme Java pour mélanger les éléments dans une LinkedList.

public class Exercice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		System.out.println(couleurs);
		Collections.shuffle(couleurs);
		System.out.println(couleurs);
	}

}

package exercicesLinkedList;

import java.util.Collections;
import java.util.LinkedList;

// 15. Ecrire un programme Java d'échange de deux éléments dans une LinkedList.

public class Exercice15 {

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
		Collections.swap(couleurs, 4, 2);
		System.out.println(couleurs);
		
	}

}

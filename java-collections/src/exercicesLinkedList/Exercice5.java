package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice5 {

	// 5. Ecrire un programme Java pour ins�rer l'�l�ment sp�cifi� � la position
	// sp�cifi�e dans la LinkedList.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");

		// Mise � jour
		couleurs.set(2, "Turquoise");
		System.out.println(couleurs);
	}

}

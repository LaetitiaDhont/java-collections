package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice6 {

	// Ecrire un programme Java pour ins�rer des �l�ments dans la LinkedList en
	// premi�re et derni�re position.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");

		couleurs.addFirst("Cyan");
		couleurs.addLast("Rouge");

		System.out
				.println("Premi�re position :" + couleurs.getFirst() + " " + " Derni�re position : " + couleurs.getLast());

		System.out.println(couleurs);
	}

}

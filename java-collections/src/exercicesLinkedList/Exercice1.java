package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice1 {
	// 1. Ecrire un programme Java pour ajouter l'�l�ment sp�cifi� � la fin d'une
	// LinkedList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");

		// addLast rajoute un �lement en derniere position
		couleurs.addLast("Cyan");

		// getLast prend le dernier �l�ment d'une liste
		System.out.println(couleurs.getLast());
	}

}

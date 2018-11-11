package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice12 {

	// 12. Ecrire un programme Java pour supprimer un élément spécifié d'une LinkedList.

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
		
		couleurs.remove(3);
		
		System.out.println(couleurs);
	}

}

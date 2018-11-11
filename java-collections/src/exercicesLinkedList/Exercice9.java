package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice9 {

	// 9. Ecrire un programme Java pour insérer des éléments à la position spécifiée
	// dans une LinkedList.
	public static void main(String[] args) {

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		couleurs.add(3, "Kaki");
		System.out.println(couleurs);

	}
	

}

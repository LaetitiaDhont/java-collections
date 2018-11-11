package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice19 {

	// 19. Ecrire un programme Java pour supprimer et renvoyer le premier élément d'une LinkedList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String> ();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		System.out.println(couleurs);
		couleurs.removeFirst();
		System.out.println(couleurs.getFirst());
		System.out.println(couleurs);
	}

}

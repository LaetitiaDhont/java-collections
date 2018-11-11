package exercicesLinkedList;

import java.util.LinkedList;

// 13. Ecrire un programme Java pour supprimer le premier et le dernier élément d'une LinkedList.
public class Exercice13 {

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
		
		couleurs.removeFirst();
		couleurs.removeLast();
		
		System.out.println(couleurs);

	}

}

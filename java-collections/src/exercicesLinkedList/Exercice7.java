package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice7 {

	// 7. Ecrire un programme Java pour ins�rer l'�l�ment sp�cifi� au d�but d'une LinkedList.

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
		System.out.println("Premi�re position : " + couleurs.getFirst());
		System.out.println(couleurs);
	}

}

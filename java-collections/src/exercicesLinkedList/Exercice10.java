package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice10 {

	// 10. Ecrire un programme Java pour obtenir la premi�re et la derni�re
	// occurrence des �l�ments sp�cifi�s dans une LinkedList.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		System.out.println("Premi�re position : " + couleurs.getFirst() + " " + "Derni�re position : " + couleurs.getLast());
		System.out.println(couleurs);
	}

}

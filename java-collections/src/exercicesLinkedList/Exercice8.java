package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		couleurs.addLast("Cyan");
		System.out.println("Le dernier élément :" + couleurs.getLast());
		System.out.println(couleurs);
	}

}

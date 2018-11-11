package exercicesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercice11 {

	// 11. Ecrire un programme Java pour afficher les éléments et leurs positions
	// dans une LinkedList.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");

		
		ListIterator<String> li = couleurs.listIterator();
		while(li.hasNext()) {
			System.out.println(li.nextIndex() + " " + li.next());
		}
	}

}

package exercicesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

// 2. Ecrire un programme Java pour parcourir tous les éléments d'une LinkedList.

public class Exercice2 {

	public static void main(String[] args) {
		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		
		ListIterator<String> li = couleurs.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}

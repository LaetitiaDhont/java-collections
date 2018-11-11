package exercicesLinkedList;

import static java.util.Collections.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercice4 {
// 4. Ecrire un programme Java pour itérer une LinkedList dans l'ordre inverse.

	public static void main(String[] args) {

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		
		
		// reverseOrder pour imprimer en ordre inverse
		sort(couleurs, Collections.reverseOrder());

		
		System.out.println(couleurs);
	}

}

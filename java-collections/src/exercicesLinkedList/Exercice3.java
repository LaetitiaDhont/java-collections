package exercicesLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercice3 {
	// 3. Ecrire un programme Java pour parcourir tous les éléments d'une LinkedList
	// en commençant à la position spécifiée.

	public static void main(String[] args) {

		LinkedList<String> couleurs = new LinkedList<String>();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");

		// listIterator peut prendre en argument la position de mon choix
		ListIterator<String> it = couleurs.listIterator(1);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

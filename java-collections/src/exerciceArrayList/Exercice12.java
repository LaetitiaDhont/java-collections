
package exerciceArrayList;

import java.util.ArrayList;

public class Exercice12 {
	// Ecrire un programme Java pour extraire une partie donnée une arraylist.
	public static void main(String[] args) {

		ArrayList<String> prenoms = new ArrayList<String>();

		prenoms.add("Laetitia");
		prenoms.add("Pierrre");
		prenoms.add("Constance");
		prenoms.add("Vanessa");
		prenoms.add("Greg");
		prenoms.add("Dominick");
		prenoms.add("Hamed");
		prenoms.add("Diarra");

		// Liste ou tu indiques l'index ou tu veux commencer et celui ou tu veux t'arrêter
		System.out.println(prenoms.subList(0, 4));

	}

}

package exerciceArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exercice19 {

	// Ecrire un programme Java pour imprimer tous les éléments d’une ArrayList en
	// utilisant la position des éléments.
	
	public static void main(String[] args) {
		ArrayList<String> couleurs = new ArrayList<String>();
		
		couleurs.add("Rouge");
		couleurs.add("Bleu");
		couleurs.add("Violet");
		couleurs.add("Magenta");
		couleurs.add("Cyan");
		
		ListIterator<String> it = couleurs.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

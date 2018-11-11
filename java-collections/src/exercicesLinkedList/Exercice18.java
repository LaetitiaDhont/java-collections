package exercicesLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercice18 {

	// 18. Ecrire un programme Java pour cloner une LinkedList en une autre LinkedList.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> couleurs = new LinkedList<String> ();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		ArrayList<String> couleurs2 = (ArrayList<String>) couleurs.clone();

		System.out.println(couleurs);
		System.out.println(couleurs2);
		
	}

}

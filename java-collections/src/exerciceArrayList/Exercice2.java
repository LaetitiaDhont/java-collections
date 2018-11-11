package exerciceArrayList;

import java.util.ArrayList;

public class Exercice2 {

	/*
	 * Ecrire un programme Java pour parcourir tous les éléments d'une
	 * arraylist.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> couleurs = new ArrayList<String>();

		couleurs.add("Rouge");
		couleurs.add("Jaune");
		couleurs.add("Bleu");
		couleurs.add("Vert");
		couleurs.add("Violet");

		System.out.println(couleurs);

		for (int i = 0; i < couleurs.size(); i++) {
			System.out.println(couleurs.get(i));
		}

		System.out.println("-------------------------------");
		System.out.println("For each");
		System.out.println("-------------------------------");

		for (String n : couleurs) {
			System.out.println(n);
		}
	}

}

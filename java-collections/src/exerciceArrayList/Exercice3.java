package exerciceArrayList;

import java.util.ArrayList;

public class Exercice3 {

	/*
	 * 3. Ecrire un programme Java pour insérer un élément dans l’ arraylist à la
	 * première position.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> animaux = new ArrayList<String>();

		animaux.add("Tigre");
		animaux.add("Chat");
		animaux.add("Singe");
		animaux.add("Lion");

		animaux.add(0, "Greg");

		System.out.println(" L'élément à la première position c'est " + animaux.get(0));

		for (int i = 0; i < animaux.size(); i++) {

			System.out.println("donnée à l'indice " + i + " = " + animaux.get(i));

		}

	}

}

package exerciceArrayList;

import java.util.ArrayList;

public class Exercice3 {

	/*
	 * 3. Ecrire un programme Java pour ins�rer un �l�ment dans l� arraylist � la
	 * premi�re position.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> animaux = new ArrayList<String>();

		animaux.add("Tigre");
		animaux.add("Chat");
		animaux.add("Singe");
		animaux.add("Lion");

		animaux.add(0, "Greg");

		System.out.println(" L'�l�ment � la premi�re position c'est " + animaux.get(0));

		for (int i = 0; i < animaux.size(); i++) {

			System.out.println("donn�e � l'indice " + i + " = " + animaux.get(i));

		}

	}

}

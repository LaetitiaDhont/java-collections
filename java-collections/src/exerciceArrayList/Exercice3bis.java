package exerciceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice3bis {

	/*
	 * 3. Ecrire un programme Java pour ins�rer un �l�ment dans l� arraylist � la
	 * premi�re position.
	 */

	public static void main(String[] args) {
		ArrayList<String> moyensTransport = new ArrayList<String>();

		moyensTransport.add("Voiture");
		moyensTransport.add("Avion");
		moyensTransport.add("Camion");
		moyensTransport.add("V�lo");
		moyensTransport.add("M�tro");

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer un moyen de transport � rajouter :");
		String userInput = sc.nextLine();

		moyensTransport.add(0, userInput);

		for (int i = 0; i < moyensTransport.size(); i++) {
			System.out.println(moyensTransport.get(i));
		}
	}

}

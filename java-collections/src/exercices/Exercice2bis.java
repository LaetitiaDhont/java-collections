package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice2bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> notes = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir vos notes : ");

		// Tant que la taille de mon ArrayList est inférieur à 20 je continue
		while (notes.size() < 20) {
			double userInput = sc.nextDouble();
			notes.add(userInput);

			double total = 0;
			// "Pour chaque element que l'on nomme note de mon ArrayList notes fait ceci :" 
			for (Double note : notes) {
				// total = total + note
				total += note;
			}
			// Je divise la le total de la somme de mes notes par la taille mon tableau
			// La taille de mon tableau qui est finalement mon nombre de notes
			double moyenneNotes = total / notes.size();
			if (notes.size() >= 20) {
				System.out.println("Votre moyenne est de : " + moyenneNotes);
			}

		}
	}
}

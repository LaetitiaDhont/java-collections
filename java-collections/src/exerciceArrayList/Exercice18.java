package exerciceArrayList;

import java.util.ArrayList;

public class Exercice18 {
// 18. Ecrire un programme Java pour tester une arraylist est vide ou non.

	public static void main(String[] args) {

		ArrayList<String> marques = new ArrayList<String>();
		
		marques.add("Pampers");
		marques.add("Bose");
		marques.add("Samsung");
		marques.add("MSI");
		marques.add("Intel");
		
		if(marques.isEmpty()) {
			System.out.println("La liste est vide !");
		}
		else {
			System.out.println("La liste est pleine!");
		}
		
		ArrayList<String> cerveauDeGreg = new ArrayList<String>();
		
		if(cerveauDeGreg.isEmpty()) {
			System.out.println("Le cerveau de Greg est vide !");
		}
		else {
			System.out.println("Le cerveau de Greg est plein! Incroyable!");
		}
		
	}

}

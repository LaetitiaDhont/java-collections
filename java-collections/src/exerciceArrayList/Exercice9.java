package exerciceArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercice9 {
// 9. Ecrire un programme Java pour copier une arraylist dans une autre.
	public static void main(String[] args) {

		ArrayList<String> boissons = new ArrayList<String>();
		
		boissons.add("Coca-Cola");
		boissons.add("Ice tea");
		boissons.add("Fanta");
		boissons.add("Café");
		boissons.add("Eau");
		
		System.out.println(boissons);
		ArrayList<String> boissons2 = new ArrayList<String>();
		
		boissons2.add("Chocolat");
		boissons2.add("Lait");
		boissons2.add("Monster");
		boissons2.add("Rhum");
		boissons2.add("Vin");
		
		System.out.println(boissons2);
		
		// Méthode qui ajoute tout les éléments d'une ArrayList dans une autre
		Collections.copy(boissons, boissons2);
		
		System.out.println(boissons2);
		
	}

}

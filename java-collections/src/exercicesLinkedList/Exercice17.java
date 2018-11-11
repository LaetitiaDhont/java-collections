package exercicesLinkedList;

import java.util.LinkedList;

public class Exercice17 {

	// 17. Ecrire un programme Java pour joindre deux LinkedLists.

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedList couleurs = new LinkedList ();

		couleurs.add("Bleu");
		couleurs.add("Noir");
		couleurs.add("Violet");
		couleurs.add("Mauve");
		couleurs.add("Marron");
		couleurs.add("Jaune");
		
		LinkedList age = new LinkedList();
		
		age.add(20);
		age.add(29);
		age.add(36);
		age.add(65);
		
		
		System.out.println(couleurs);
		System.out.println(age);
		couleurs.addAll(age);
		System.out.println(couleurs);
		
	}

}

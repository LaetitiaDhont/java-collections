package exerciceArrayList;

import java.util.ArrayList;

public class Exercice17 {

	// 17. Ecrire un programme Java pour vider une arraylist.

	public static void main(String[] args) {

		ArrayList liste = new ArrayList();
		
		liste.add("Laetitia");
		liste.add(15);
		liste.add('O');
		liste.add(15.5f);
		liste.add(20.4);
		
		System.out.println("Avant la vidange : " + liste);
		liste.removeAll(liste);
		System.out.println("Après la vidange : " + liste);
		
	}

}

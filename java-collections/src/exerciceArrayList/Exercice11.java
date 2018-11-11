package exerciceArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercice11 {

	//11. Ecrire un programme Java pour inverser des éléments dans une arraylist.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(29);
		age.add(20);
		age.add(36);
		age.add(58);
		age.add(23);
		
		System.out.println(age);
		
		// La méthode reverse permet d'inverser des éléments dans une arraylist
		Collections.reverse(age);
		
		System.out.println(age);
	}

}

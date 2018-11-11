package exerciceArrayList;

import java.util.ArrayList;

/*
 *  Ecrire un programme Java pour extraire un élément (à un index spécifié) donnée;une arraylist
 *  donnée.
 */

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> pokemons = new ArrayList<String>();

		pokemons.add("Carapuce");
		pokemons.add("Salamèche");
		pokemons.add("Lucario");
		pokemons.add("Dracaufeu");
		pokemons.add("Pichu");
		pokemons.add("Caninos");
		
		System.out.println(pokemons.get(3));
	}

}

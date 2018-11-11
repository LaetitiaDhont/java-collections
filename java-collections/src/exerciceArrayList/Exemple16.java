package exerciceArrayList;

import java.util.ArrayList;

public class Exemple16 {

	// 16. Ecrire un programme Java pour cloner une arraylist en une autre liste.

	public static void main(String[] args) {

		ArrayList<String> musique = new ArrayList<String>();
		
		musique.add("Pop");
		musique.add("Rap");
		musique.add("Electro House");
		musique.add("Classique");
		musique.add("Comptines");
		
		// La méthode clone sert à dupliquer
		@SuppressWarnings("unchecked")
		ArrayList<String> musique2 = (ArrayList<String>) musique.clone();
		System.out.println(musique);
		System.out.println(musique2);
		
	}

}

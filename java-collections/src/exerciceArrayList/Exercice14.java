package exerciceArrayList;

import java.util.ArrayList;
import java.util.Collections;

// 14. Ecrire un programme Java d'�change de deux �l�ments dans une arraylist.

public class Exercice14 {

	public static void main(String[] args) {
		ArrayList<Character> groupeSanguin = new ArrayList<Character>();

		groupeSanguin.add('O');
		groupeSanguin.add('A');
		groupeSanguin.add('B');

		// La m�thode swap �change de place deux element dans une arrayList.
		System.out.println(groupeSanguin);
		Collections.swap(groupeSanguin, 1, 2);
		System.out.println(groupeSanguin);

	}

}

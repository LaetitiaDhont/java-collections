package exercicesTreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class Exercice2 {

	// 2. Ecrire un programme Java pour parcourir tous les éléments d'un TreeSet.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> test = new TreeSet<String>();

		test.add("Laetitia");
		test.add("Pierre");
		test.add("Constance");
		test.add("Vanessa");
		
		Iterator<String> li = test.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}

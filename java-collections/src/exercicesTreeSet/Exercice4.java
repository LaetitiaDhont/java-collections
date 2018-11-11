package exercicesTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercice4 {

	// Ecrire un programme Java pour créer une vue inverse des éléments contenus
	// dans un TreeSet donné.
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

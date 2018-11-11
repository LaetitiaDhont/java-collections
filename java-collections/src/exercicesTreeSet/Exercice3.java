package exercicesTreeSet;

import java.util.TreeSet;

public class Exercice3 {
// 3. Ecrire un programme Java pour ajouter tous les éléments d'un TreeSet spécifié à un autre.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> test = new TreeSet<String>();

		test.add("Laetitia");
		test.add("Pierre");
		test.add("Constance");
		test.add("Vanessa");
		
		TreeSet<String> test2 = new TreeSet<String>();
		test2.addAll(test);
		System.out.println(test2);
		
	}

}

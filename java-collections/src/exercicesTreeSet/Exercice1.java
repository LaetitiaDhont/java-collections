package exercicesTreeSet;

import java.util.TreeSet;

// 1. Ecrire un programme Java pour créer un nouvel TreeSet, 
// ajoutez des couleurs (chaîne) et imprimez-les.

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> test = new TreeSet<String>();
		
		test.add("Laetitia");
		test.add("Pierre");
		test.add("Constance");
		test.add("Vanessa");
		
		System.out.println(test);
	}

}

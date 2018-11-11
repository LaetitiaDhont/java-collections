package exerciceArrayList;

import java.util.ArrayList;

public class Exercice13 {

	// Ecrire un programme Java pour comparer deux arraylists.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nombre = new ArrayList<Integer>();

		nombre.add(5);
		nombre.add(15);
		nombre.add(65);
		nombre.add(90);
		nombre.add(74);

		ArrayList<Integer> nombre2 = new ArrayList<Integer>();

		nombre2.add(9);
		nombre2.add(15);
		nombre2.add(89);
		nombre2.add(54);
		nombre2.add(30);

		ArrayList<Integer> nombre3 = new ArrayList<Integer>();

		for (int i = 0; i < nombre.size(); i++) {
			if (nombre.get(i).equals(nombre2.get(i))) {
				nombre3.add(1);
			} else {

				nombre3.add(0);
			}

		}
		
		System.out.println("nombre3 " + nombre3);
	}
}

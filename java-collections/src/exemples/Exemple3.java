package exemples;

import java.util.ArrayList;

public class Exemple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();

		al.add("Hello");

		al.add(4);

		al.add(12.20f);

		al.add("Hi");

		for (int i = 0; i < al.size(); i++) {

			System.out.println("donn�e � l'indice " + i + " = " + al.get(i));

		}
	}

}

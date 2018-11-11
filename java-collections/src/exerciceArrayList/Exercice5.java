package exerciceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice5 {

	// Ecrire un programme Java pour mettre à jour un élément spécifique par élément
	// donné.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nombres = new ArrayList<Integer>();

		nombres.add(15);
		nombres.add(45);
		nombres.add(85);
		nombres.add(62);
		nombres.add(02);

		Scanner sc = new Scanner(System.in);
		System.out.println(nombres);
		System.out.println("Veuillez indiquer un index : ");
		int userInputIndex = sc.nextInt();

		System.out.println("Veuillez indiquer un chiffre : ");
		int userInputElement = sc.nextInt();

		nombres.add(userInputIndex, userInputElement);

		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));

		}

	}

}

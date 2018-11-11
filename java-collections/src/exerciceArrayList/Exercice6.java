package exerciceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Ecrire un programme Java pour supprimer le troisième élément donnée;une arraylist.
public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Float> decimal = new ArrayList<Float>();

		decimal.add(15.5f);
		decimal.add(6.65f);
		decimal.add(65.54f);
		decimal.add(63.5f);
		decimal.add(54.4f);
		decimal.add(64.65f);

		System.out.println("Voici l'ArrayList avant la suppression : ");
		for (int i = 0; i < decimal.size(); i++) {
			System.out.println(decimal.get(i));

		}
		
		decimal.remove(2);
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i<decimal.size();i++) {
			System.out.println(decimal.get(i));
		}

	}

}

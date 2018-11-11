package exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> moyenne = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez rentrer 5 valeurs numériques : ");

		while (al.size() < 5) {
			int userInput = sc.nextInt();
			al.add(userInput);

			if (userInput >= 10) {
				moyenne.add(userInput);
			}

		}
		
		System.out.println("Il y a " + moyenne.size() + " au dessus de la moyenne.");

	}

}

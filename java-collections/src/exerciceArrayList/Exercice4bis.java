package exerciceArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice4bis {


/*
 *  Ecrire un programme Java pour extraire un �l�ment (� un index sp�cifi�) donn�e;une arraylist
 *  donn�e.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> alphabet = new ArrayList<Character>();
		
		alphabet.add('a');
		alphabet.add('r');
		alphabet.add('t');
		alphabet.add('i');
		alphabet.add('c');
		alphabet.add('h');
		alphabet.add('a');
		alphabet.add('u');
		alphabet.add('t');
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez indiquer un index : ");
		int userInput = sc.nextInt();
		
		System.out.println("L'�l�ment � la "+ userInput + " �me position est la lettre : " + alphabet.get(userInput));
		
		
	}

}

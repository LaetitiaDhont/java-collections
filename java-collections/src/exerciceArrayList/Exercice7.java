package exerciceArrayList;

import java.util.ArrayList;
import java.util.Scanner;



// Ecrire un programme Java pour rechercher un élément dans une arraylist.
public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> coin = new ArrayList<String>();

		coin.add("constance");
		coin.add("pierre");
		coin.add("laetitia");
		coin.add("vanessa");
		coin.add("dominick");
		coin.add("greg");

		// Rechercher un élément avec contains, contains retourne false si mon objet
		// n'existe pas
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper le nom de votre canard :");
		String userInput = sc.nextLine();

		if (coin.contains(userInput.toLowerCase()) == true) {
			System.out.println("Votre objet existe déjà dans la liste!");
			for (int i = 0; i < coin.size(); i++) {
				System.out.println(coin.get(i));
			}
		}

		if (coin.contains(userInput.toLowerCase()) == false) {
			System.out.println("Votre objet n'existe pas voulez-vous le creer ? yes/no");
			String userYesNo = sc.nextLine();
			switch (userYesNo.toLowerCase()) {
			case "yes":
				coin.add(userInput);
				System.out.println("Votre objet a bien été créé.");
				System.out.println("Voici la nouvelle liste :" + coin);
				break;
			case "no":
				System.out.println("Votre objet n'a pas été créé.");
				System.out.println("La liste est intacte : " + coin);
				break;
			}

		}
	}

}

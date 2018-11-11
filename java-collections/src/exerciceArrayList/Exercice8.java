package exerciceArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Collections.sort;

public class Exercice8 {

	// 8. Ecrire un programme Java pour trier une arraylist donn�e.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> armes = new ArrayList<String>();
		
		armes.add("Pistolet");
		armes.add("Couteau");
		armes.add("Corde");
		armes.add("AK47");
		armes.add("Pistolet Laser");
		
		
		// Trier en ordre croissant
		Collections.sort(armes);
		
		System.out.println("Ordre croissant : " + armes);

		// Trier en ordre d�croissant
		sort(armes, Collections.reverseOrder());
		
		System.out.println("Ordre d�croissant : " + armes);
	}

}

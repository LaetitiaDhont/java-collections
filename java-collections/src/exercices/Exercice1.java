package exercices;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List studentList = new LinkedList();

		studentList.add("Jean");

		studentList.add("Philippe");

		studentList.add("Corine");
		
		studentList.add("Isabelle");
		
		studentList.add("Charles");
		
		studentList.add("Paul");
		
		
		for(int i = 0; i<studentList.size();i++) {
			System.out.println("Élément à l'index " + i + "= " + studentList.get(i));
			
			
	}
		
		System.out.println("\n \tParcours avec un itérateur ");

		System.out.println("-------------------------------- ---");

		

	}

}

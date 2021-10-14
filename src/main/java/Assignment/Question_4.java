package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_4 {
	public static void main(String[] args) {

		ArrayList<Person_Question4> names = new ArrayList<>(); // Create an ArrayList object
		//Arrays.asList("Diego", "Jeremy", "Saahir", "Boris", "Raul", "Shannon", "Jordan",
		//				"Caleb", "Jade", "Ishmell", "Cece")

		Person_Question4 diego = new Person_Question4("Diego");
		Person_Question4 jeremy = new Person_Question4("Jeremy");
		Person_Question4 saahir = new Person_Question4("Saahir");
		Person_Question4 boris = new Person_Question4("Boris");
		Person_Question4 raul = new Person_Question4("Raul");
		Person_Question4 shannon = new Person_Question4("Shannon");
		Person_Question4 jordan = new Person_Question4("Jordan");
		Person_Question4 caleb = new Person_Question4("Caleb");
		Person_Question4 jade = new Person_Question4("Jade");
		Person_Question4 ishmell = new Person_Question4("Ishmell");
		Person_Question4 cece = new Person_Question4("Cece");
		Person_Question4 lia = new Person_Question4("Lia");
		Person_Question4 daya = new Person_Question4("Daya");



		names.add(diego);
		names.add(jeremy);
		names.add(saahir);
		names.add(boris);
		names.add(raul);
		names.add(shannon);
		names.add(jordan);
		names.add(caleb);
		names.add(jade);
		names.add(ishmell);
		names.add(cece);
		names.add(lia);
		names.add(daya);

		for (Person_Question4 i : names){
			System.out.println(i);
		}

	}


}

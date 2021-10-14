package Assignment;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[] args) {

		while (true) {
			Scanner nameScanner = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter your name");

			String name = nameScanner.nextLine();  // Read user input

			if (name.equalsIgnoreCase("Hakeem")) {
				System.out.println("Welcome Hakeem!");
				break;
			} else if (name.equalsIgnoreCase("Aliyah")) {
				System.out.println("Welcome Aliyah!");
				break;
			} else {
				System.out.println("Please enter your name.");

			}
		}

	}

}

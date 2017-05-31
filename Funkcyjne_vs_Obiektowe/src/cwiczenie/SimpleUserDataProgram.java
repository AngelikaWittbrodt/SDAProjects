package cwiczenie;

import java.util.Scanner;

public class SimpleUserDataProgram {
	
	//Ma sowje zastosowanie w wielowątkowości

	public static void main(String[] args) {
		showData(getDate());
		//Tutaj widać że wpływamy na metodę.
		showData("Adrian");
	}

	public static String getDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imię: ");
		String name = scanner.nextLine();
		scanner.close();
		return name;
	}

	public static void showData(String name) {
		System.out.println(name);
	}

}

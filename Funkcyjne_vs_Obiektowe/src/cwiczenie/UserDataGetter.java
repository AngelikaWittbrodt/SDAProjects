package cwiczenie;

import java.util.Scanner;

public class UserDataGetter {

	private String name;

	public static void main(String[] args) {

		UserDataGetter userDataGetter = new UserDataGetter();
		userDataGetter.getData();
		userDataGetter.showData();

	}

	public void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imię: ");
		name = scanner.nextLine();
		scanner.close();

	}

	public void showData() {
		System.out.println(name);
	}

}

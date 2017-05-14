package kompozycja;

public class FirmaTest {

	public static void main(String[] args) {

		Firma firma = new Firma("Super Firma", TypFirmy.SPOLKA_JAWNA, new Adres("Kwiatowa", "Gdańsk", 170));
		Pracownik pracownik = new Pracownik("Jan", "Kowalski", new Adres("Kwiatowa", "Gdańsk", 10));
		Pracownik pracownik1 = new Pracownik("Adam", "Nowy", new Adres("Kwiatowa", "Gdańsk", 100));
		Pracownik pracownik2 = new Pracownik("Ola", "Druga", new Adres("Kwiatowa", "Warszawa", 100));

		firma.add(pracownik);
		firma.add(pracownik1);
		firma.add(pracownik2);
		firma.add(new Pracownik("Jan", "Domnik", new Adres("Złota", "Gdańsk", 90)));

		//show(pracownik);
		show(firma);
	}

	// Metody mają te same nazwy ale zawierają różne typy parametrów
	// Nazywamy to przeciążaniem (polimorfizm statyczny, nie dlatego
	// ,że metody są statyczne)
	// Poliformizm dynamiczny dzieje się na obiekcie

	public static void show(Firma firma) {
		System.out.println(firma.getNazwa() + "(" + firma.getTyp() + ")");
		show(firma.getAdres());
		for (Pracownik pracownik : firma.getPracownicy()) {
			show(pracownik);
		}
	}

	public static void show(Pracownik pracownik) {

		System.out.println(" Pracownik : " +pracownik.getImie() + " " + pracownik.getNazwisko());
		show(pracownik.getAdres());
	}

	public static void show(Adres adres) {
		System.out.println("Adres:" + adres.getMiasto() + " " + adres.getNumerDomu() + " " + adres.getUlica());
	}
}

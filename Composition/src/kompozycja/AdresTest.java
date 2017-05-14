package kompozycja;

public class AdresTest {

	public static void main(String[] args) {
		
		Adres adres = new Adres("Kwiatowa", "Warszawa", 22);
		
		//Metoda faktorująca
		Adres.createAdres("Zabytkowa", "Gdynia", 12);
		Adres.createAdres("Pomorska", "Kraków", 25);
	}

}

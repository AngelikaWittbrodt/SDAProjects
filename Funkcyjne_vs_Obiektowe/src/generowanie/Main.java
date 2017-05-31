package generowanie;

public class Main {

	public static void main(String[] args) {

		// Obiekt przestał istnieć. Wskaźnik wskazuje coś innego.
		NumberGenerator generator = new FourGenerator();
		System.out.println(generator.generate());

		// klasa abstrakcyjna = klasa anonimowa, definicja klasy bez nazwy.
		// Tworzy ta klase w folderze, można podejrzeć
		generator = new NumberGenerator() {
			@Override
			public int generate() {
				return 10;
			}
		};
		System.out.println(generator.generate());

		// Tutaj się zaczyna programowanie funkcyjne:(wyrażenie lambda)
		generator = () -> 8;
		// Tutaj klasa się nie wygenerował w folderze.
		//Funkcja bez nazwy, kt�ra ma ciało.
		System.out.println(generator.generate());
		generator = () -> {
			return 12;
		};
		System.out.println(generator.generate());
		// :: to oznacza �e wskazuje
		generator = Main::generateOne;
		System.out.println(generator.generate());

	}

	// Tutaj mamy funkcj� z nazwa i mo�na j� przypisa� do generatora.
	// Musi by� zgodana z interfejsem dlatgo nie zwr�ci nam double.
	public static int generateOne() {
		return 1;
	}
}

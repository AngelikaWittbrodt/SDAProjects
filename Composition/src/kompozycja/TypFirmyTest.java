package kompozycja;

public class TypFirmyTest {

	public static void main(String[] args) {

		// Nie można tworzyć Enumów:
		// new TypFirmy(4);
		new TypButow(4);

		TypFirmy typFirmy = TypFirmy.SPOLKA_JAWNA;
		TypButow typButow = TypButow.KALOSZE;

		// Enumy są finalne ponieważ nie można przypisać ich sobie nawzajem:
		// TypFirmy.SPOLKA_JAWNA = TypFirmy.SPOLKA_KOMANDYTOWA;

	}

}

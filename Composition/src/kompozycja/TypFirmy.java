package kompozycja;

public enum TypFirmy {
	SPOLKA_JAWNA(12), SPOLKA_ZOO(20), SPOLKA_KOMANDYTOWA(19);

	private int podatek;

	TypFirmy(int podatek) {
		this.podatek = podatek;
	}
}

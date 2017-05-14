package kompozycja;

public class TypButow {

	public final static TypButow KAPCIE = new TypButow(10);
	public final static TypButow KALOSZE = new TypButow(12);
	
	private int rozmiar;
	
	TypButow(int rozmiar) {
		this.rozmiar = rozmiar;
	}
}

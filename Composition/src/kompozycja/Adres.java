package kompozycja;

public class Adres {

	private String ulica;
	private String miasto;
	private int numerDomu;

	public Adres(String ulica, String miasto, int numerDomu) {
		this.ulica = ulica;
		this.miasto = miasto;
		this.numerDomu = numerDomu;
	}

	// Factory metod - metoda wyrównawcza (Wzorzec projektowy: Wzorzec Fabryka)
	public static Adres createAdres(String ulica, String miasto, int numerDomu) {
		Adres adres = new Adres(ulica, miasto, numerDomu);
		adres.ulica = ulica;
		adres.miasto = miasto;
		adres.numerDomu = numerDomu;
		return adres;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public int getNumerDomu() {
		return numerDomu;
	}

	public void setNumerDomu(int numerDomu) {
		this.numerDomu = numerDomu;
	}
}

package kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Firma {
	private List<Pracownik> pracownicy;
	private String nazwa;
	private TypFirmy typ;
	private Adres adres;

	// Inicjalizuje zmienna pusta, a potem dodam do niej pracowników:
	public Firma(String nazwa, TypFirmy typ, Adres adres) {
		this.nazwa = nazwa;
		this.typ = typ;
		this.adres = adres;
		this.pracownicy = new ArrayList<>();
		this.pracownicy.add(new Pracownik("", "", null));
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Pracownik> getPracownicy() {
		return pracownicy;
	}

	public void setPracownicy(List<Pracownik> pracownicy) {
		this.pracownicy = pracownicy;
	}

	public TypFirmy getTyp() {
		return typ;
	}

	public void setTyp(TypFirmy typ) {
		this.typ = typ;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public void add(Pracownik pracownik) {
		pracownicy.add(pracownik);
	}

}

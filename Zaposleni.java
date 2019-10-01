package DomaciNo18Jedan;

public class Zaposleni extends Covek {
	private int godinaZaposlenja;
	private int plata;

	public Zaposleni(String ime, String prezime, int godinaRodjenja, int plata) {
		super(ime, prezime, godinaRodjenja);
		this.plata = plata;
		this.godinaZaposlenja = godinaZaposlenja;
	}

	public int getGodinaZaposlenja() {
		return godinaZaposlenja;
	}

	public void setGodinaZaposlenja(int gz) {
		this.godinaZaposlenja = gz;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int p) {
		this.plata = p;
	}

	public String toString() {
		return "Zaposlen: " + super.getIme() + super.getPrezime() + " rodjen: " + super.godinaRodjenja + " zaposlen "
				+ getGodinaZaposlenja()+ " godine. Visina plate: "+ getPlata();
	}

}

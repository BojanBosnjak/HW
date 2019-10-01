package DomaciNo18Jedan;

public class Asistent extends Nastavnik {
	private String smer;

	public Asistent(String ime, String prezime, int godinaRodjenja, String smer) {
		super(ime, prezime, godinaRodjenja, smer);
		this.smer = smer;

	}

	public String getSmer() {
		return smer;
	}

	public void setSmer(String sm) {
		this.smer = sm;
	}

	public String toString() {
		return "Asistent " + super.getIme() + super.getPrezime() + " Smer doktorskih studija: " + getSmer();
	}
}

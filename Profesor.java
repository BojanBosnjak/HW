package DomaciNo18Jedan;

public class Profesor extends Nastavnik {
	private String titula;

	public Profesor(String ime, String prezime, int godinaRodjenja, String titula) {
		super(ime, prezime, godinaRodjenja, titula);
		this.titula = titula;

	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	public String toString() {
		return "Titula predavaca: " + getTitula();
	}

}

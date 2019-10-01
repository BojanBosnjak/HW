package DomaciNo18Jedan;

public class Student extends Covek {
	private int trenutnaGodina;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godinaRodjenja, int trenutnaGodina, double trenutniProsek) {
		super(ime, prezime, godinaRodjenja);
		this.trenutnaGodina = trenutnaGodina;
		this.trenutniProsek = trenutniProsek;
	}

	public int getGodinaStudija() {
		return trenutnaGodina;
	}

	public void setGodinaStudija(int gs) {
		this.trenutnaGodina = gs;
	}

	public double getTrenutniProsek() {
		return trenutniProsek;
	}

	public void setTrenutniProsek(double tp) {
		this.trenutniProsek = tp;
	}

	public String toString() {
		return "Student: " + super.getIme() + super.getPrezime() + " rodjen " + super.godinaRodjenja + " Student je: "
				+ getGodinaStudija() + " godine studija, sa prosekom: " + getTrenutniProsek();
	}

}

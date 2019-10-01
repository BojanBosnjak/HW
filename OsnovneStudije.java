package DomaciNo18Jedan;

public class OsnovneStudije extends Student {
	private String osnovneStudije;

	public OsnovneStudije(String ime, String prezime, int godinaRodjenja, int trenutnaGodina, double trenutniProsek,
			String osnovneStudije) {
		super(ime, prezime, godinaRodjenja, trenutnaGodina, trenutniProsek);
		this.osnovneStudije = osnovneStudije;
	}

	public String getOsnovne() {
		return osnovneStudije;
	}

	public void setOsnovne(String os) {
		this.osnovneStudije = os;
	}

	public String toString() {
		return "Student: " + super.getIme() + super.getPrezime() + "\n" + "Osnovne studije" + getOsnovne() + "\n"
				+ "Godina: " + super.getGodinaStudija() + "\n" + "Sa prosekom: " + super.getTrenutniProsek();
	}

}

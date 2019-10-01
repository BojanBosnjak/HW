package DomaciNo18Jedan;

public class MasterStudije extends Student {
	private String masterStudije;

	public MasterStudije(String ime, String prezime, int godinaRodjenja, int trenutnaGodina, double trenutniProsek,
			String masterStudije) {
		super(ime, prezime, godinaRodjenja, trenutnaGodina, trenutniProsek);
		this.masterStudije = masterStudije;
	}

	public String getMaster() {
		return masterStudije;
	}

	public void setMaster(String ma) {
		this.masterStudije = ma;
	}

	public String toString() {
		return "Student: " + super.getIme() + super.getPrezime() + "\n" + "Master studije" + getMaster() + "\n"
				+ "Godina: " + super.getGodinaStudija() + "\n" + "Sa prosekom: " + super.getTrenutniProsek();
	}

}

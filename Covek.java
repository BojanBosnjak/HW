package DomaciNo18Jedan;

public class Covek {
	private String ime;
	private String prezime;
	protected int godinaRodjenja;

	public Covek(String i, String pre, int gRodj) {
		ime=i;
		prezime=pre;
		godinaRodjenja=gRodj;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public int getGodinaRdjenja() {
		return godinaRodjenja;
	}
	
	public String toString() {
		return "Ime: " + ime + "\n" + "Prezime: " + prezime + "\n" + "Godina rodjenja: " + godinaRodjenja;
	}
}


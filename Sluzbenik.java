package DomaciNo18Jedan;

public class Sluzbenik extends Zaposleni{
	public String odsek;

	public Sluzbenik(String ime, String prezime, int godinaRodjenja, String odsek) {
		super(ime, prezime, godinaRodjenja, godinaRodjenja);
		this.odsek=odsek;
	}
	public String getOdsek() {
		return odsek;
	}
	public void setOdsek(String odsek) {
		this.odsek=odsek;
	}
	
	public String toString() {
		return "Zaposleni: " + super.getIme()+super.getPrezime()+"\n Radi u odseku: " + getOdsek();
	}

}

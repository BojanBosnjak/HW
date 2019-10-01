package DomaciNo18Jedan;

public class Nastavnik extends Zaposleni {
	private String omiljeniPredmet;
	private Nastavnik[] predmeti;
	private Nastavnik[] josPredmeta;
	private int brPredmeta;

	public Nastavnik(String ime, String prezime, int godinaRodjenja, String omiljeniPredmet) {
		super(ime, prezime, godinaRodjenja, godinaRodjenja);
		this.omiljeniPredmet = omiljeniPredmet;
		brPredmeta = 0;
		predmeti = new Nastavnik[10];

	}

	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}

	public void setOmiljeniPredmet(String op) {
		this.omiljeniPredmet = op;
	}

	public void dodajPredmet(Nastavnik na) {
		int broj=predmeti.length; //u slucaju da profan dobije jos predmeta, ima gde da ih stavi
		if(brPredmeta==broj) {
			josPredmeta = new Nastavnik[10];
			for (int i=0; i<predmeti.length; i++) {
				josPredmeta[i]=predmeti[i];
			}
		}josPredmeta[broj]=na;
		brPredmeta++;
		if(brPredmeta > broj && brPredmeta<josPredmeta.length) {
			josPredmeta[brPredmeta++]=na;
		}
		else predmeti[brPredmeta++]=na;
	}
	public Nastavnik getPredmet(int pozPredmeta) {
		return predmeti[pozPredmeta];
	}

	public String toString() {
		return "Predaje :" + getPredmet(brPredmeta) + " Omiljeni predmet je: " + getOmiljeniPredmet();
	}
}

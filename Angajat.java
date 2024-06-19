
public abstract class Angajat {

	private String nume;
	private String prenume;
	private String functie;
	private int salariu;
	private int vechime;
	
	public Angajat(String nume, String prenume, String functie, int salariu, int vechime) {
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
		this.salariu = salariu;
		this.vechime = vechime;
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public int getVechime() {
		return vechime;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}
	
	public void afisareSalariu() {
		System.out.println(getSalariu()+(10/100)*getVechime());
	}
	
	public void afisareNumeSiFunctie() {
		System.out.println(getNume().concat(getPrenume()) + " (" + getFunctie() + ")");		
	}

}

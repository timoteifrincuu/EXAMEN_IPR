import java.util.ArrayList;

public class Manager extends Angajat {

	private ArrayList<Muncitor> muncitoriSubordine;
	
	public Manager(String nume, String prenume, String functie, int salariu, int vechime) {
		super(nume, prenume, functie, salariu, vechime);
		this.muncitoriSubordine = new ArrayList<Muncitor>();
	}
	
	public ArrayList<Muncitor> muncitoriSubordine() {
		return muncitoriSubordine;
	}

	public void adaugaMuncitorSubordine(Muncitor m){
		muncitoriSubordine.add(m);
	}
}

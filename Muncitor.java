import java.util.ArrayList;

public class Muncitor extends Angajat {

	private ArrayList<String> listaResponsabilitati;
	
	public Muncitor(String nume, String prenume, String functie, int salariu, int vechime) {
		super(nume, prenume, functie, salariu, vechime);
		this.listaResponsabilitati = new ArrayList<String>();
	}

	public ArrayList<String> getListaResponsabilitati() {
		return listaResponsabilitati;
	}
	
	public void adaugareResponsabilitati(String s) {
		listaResponsabilitati.add(s);
	}
	
}

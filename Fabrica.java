import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Angajat> listaAngajati;
	private ArrayList<Client> listaClienti;
	private ArrayList<Act> listaActe;
	
	public Fabrica() {
		this.listaAngajati = new ArrayList<Angajat>();
		this.listaClienti = new ArrayList<Client>();
		this.listaActe = new ArrayList<Act>();
	}
	
	public ArrayList<Angajat> getListaAngajati() {
		return listaAngajati;
	}

	public ArrayList<Client> getListaClienti() {
		return listaClienti;
	}

	public ArrayList<Act> getListaActe() {
		return listaActe;
	}

	public void adaugareAngajat(Angajat a){
		listaAngajati.add(a);
	}

	public void concediereAngajat(Angajat a) {
		listaAngajati.remove(a);
	}
	
	public void afisareAngajatiActivi() {
	    for (Angajat angajat : listaAngajati) {
	        System.out.println(angajat);
	      }
	}
	
	public void adaugareClient(Client c) {
		listaClienti.add(c);
	}
	
	
	public static void main(String[] args) {
	
	}

}

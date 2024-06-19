
public class Act {

	private int ID;
	private int nrIdentificare = (int) Math.random()/*1000000*/;
	
	public Act(int ID) {
		this.nrIdentificare = nrIdentificare;
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

//	public int getNrIdentificare() {
//		return nrIdentificare;
//	}	
	
}

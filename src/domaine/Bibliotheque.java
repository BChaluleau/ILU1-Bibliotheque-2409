package domaine;

public class Bibliotheque {

	private Ouvrage[] ouvrages;
	private int nbOuvragesMax;
	private int nbOuvrages = 0;

	public Bibliotheque(int nbOuvragesMaximum) {
		this.nbOuvragesMax = nbOuvragesMaximum;
		ouvrages = new Ouvrage[nbOuvragesMaximum];
	}

	public Ouvrage[] getOuvrages() {
		return ouvrages;
	}

}

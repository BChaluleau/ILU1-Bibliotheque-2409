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

	@Override
	public String toString() {
		String description = "Bibliotheque [";
		for (int i = 0; i < nbOuvrages; i++) {
			description += "\n" + ouvrages[i];
		}
		return description + "\n]";
	}

}

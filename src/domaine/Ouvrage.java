package domaine;

public class Ouvrage {

	private static int NB_MAX_EXEMPLAIRES = 100; // partagée par toutes les instances

	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private String isbn;
	private Exemplaire[] exemplaires = new Exemplaire[NB_MAX_EXEMPLAIRES];

	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteur, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

	public Exemplaire ajoutExemplaire(Exemplaire exemplaire) {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			exemplaires[nbExemplaires] = exemplaire;
			nbExemplaires++;
			return exemplaire;
		}
		return null;
	}

	public int getAnnee() {
		return annee;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitre() {
		return titre;
	}

	@Override
	public String toString() {
		String description = "Ouvrage [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", annee="
				+ annee + ", isbn=" + isbn + "]";
		for (int i = 0; i < nbExemplaires; i++) {
			Exemplaire exemplaire = exemplaires[i];
			description += "\n" + exemplaire;

		}
		return description;
	}

}

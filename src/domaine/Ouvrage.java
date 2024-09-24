package domaine;

public class Ouvrage {

	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private String isbn;
	private Exemplaire[] exemplaires = new Exemplaire[100];

	private int nbExemplaires = 0;

	public Ouvrage(String titre, String auteur, String editeur, int annee, String isbn) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
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

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public String getTitre() {
		return titre;
	}

}

package domaine;

public class Exemplaire {
	private boolean empruntable = true;
	private boolean enLigne = true;
	private String cote;

	public Exemplaire(String cote) {
		this.cote = cote;
	}

	public String getCote() {
		return cote;
	}

	public boolean isEmpruntable() {
		return empruntable;
	}

	public boolean isEnLigne() {
		return enLigne;
	}

	public void setEmpruntable(boolean empruntable) {
		this.empruntable = empruntable;
	}

	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}

	@Override
	public String toString() {
		return "\tExemplaire [empruntable=" + empruntable + ", enLigne=" + enLigne + ", cote=" + cote + "]";
	}

}

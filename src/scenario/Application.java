package scenario;

import domaine.Bibliotheque;
import domaine.Exemplaire;
import domaine.Ouvrage;

public class Application {

	public static void main(String[] args) {
		Bibliotheque bibli = new Bibliotheque(50);

		Ouvrage ouvrage = new Ouvrage("Titre", "Auteur", "Editeur", 2024, "isbn");

		Exemplaire exemplaire = new Exemplaire("KC-12");

		System.out.println(bibli);

	}

}

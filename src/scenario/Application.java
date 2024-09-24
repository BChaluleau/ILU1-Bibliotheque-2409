package scenario;

import domaine.Bibliotheque;
import domaine.Exemplaire;
import domaine.Ouvrage;

public class Application {

	public static void main(String[] args) {
		Bibliotheque bibli = new Bibliotheque(50);

		Ouvrage ouvrage = new Ouvrage("Titre", "Auteur", "Editeur", 2024, "isbn");
		Ouvrage o2 = new Ouvrage("La suite", "Auteur", "Editeur", 2024, "isbn2");

		bibli.ajouteOuvrage(ouvrage);
		bibli.ajouteOuvrage(o2);

		Exemplaire exemplaire = new Exemplaire("KC-12");

		ouvrage.ajoutExemplaire(exemplaire);

		System.out.println(bibli);

	}

}

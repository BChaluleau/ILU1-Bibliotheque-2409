package scenario;

import domaine.Bibliotheque;
import domaine.Ouvrage;

public class Application {

	public static void main(String[] args) {
		Bibliotheque bibli = new Bibliotheque(50);

		Ouvrage o1 = bibli.ajouteOuvrage("Titre", "Auteur", "Editeur", 2024, "isbn");
		Ouvrage o2 = bibli.ajouteOuvrage("La suite", "Auteur", "Editeur", 2024, "isbn2");
		Ouvrage o3 = bibli.ajouteOuvrage("Livre perdu", "Auteur", "Editeur", 2024, "isbn2");

		o1.ajoutExemplaire();
		o2.ajoutExemplaire();
		o1.ajoutExemplaire();
		System.out.println(bibli);

	}

}

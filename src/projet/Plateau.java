package projet;

public class Plateau {
/*=== ATTRIBUTS ===*/
	Grille grille;
	Humain j1;
	Ordinateur j2;
	Case c; // je ne comprends pas pourquoi nous avons un attribut case
/*=== CONSTRUCTEUR  ====*/	
	public Plateau(Grille g, Humain h, Ordinateur o) {
		this.grille = g;
		this.j1 = h;
		this.j2 = o;
	}
/*=== METHODES ====*/
	public void plateauVide() {
		// donne la couleur blanche � toutes les cases de la grille
	}
	
	public void remplirPlateau() {
		// saisit le plateau fourni en entr�e
	}
	
	public void remplirRegion() {
		// modifie le quadtree lorsque la derni�re case d'une r�gion est remplie 
	}
}

package projet;

import java.lang.Math;

public class Grille {
/*=== ATTRIBUTS ===*/
	int longeur;
	int largeur;
	int n;
/*=== CONSTRUCTEUR  ====*/	
	public Grille(int nb) {
		this.n = nb;
		int j = (int) Math.pow(2, nb);
		this.longeur = 3 * j;
		this.largeur = 3 * j;
	}
/*=== METHODES ====*/
	public void afficheGrille() {
		// rend visible la grille
	}
	
	public void dessineGrille() {
		// dessine la grille
	}
}

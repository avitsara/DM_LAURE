package projet;

public class Humain extends Joueur {
/*=== ATTRIBUTS ===*/
	
/*=== CONSTRUCTEUR  ====*/	
	public Humain(String nom, String couleur) {
		super(nom, couleur);
	}
	
/*=== METHODES ====*/
	public void jouerBrave() {
		// type de jeu brave pour l'humain
		Case c = this.choixCase();
		c.couleur = "rouge";
		if (c.caseNord().estColorié()) {
			c.caseNord().couleur = "rouge";
		}
		if (c.caseNordOuest().estColorié()) {
			c.caseNordOuest().couleur = "rouge";
		}
		if (c.caseNordEst().estColorié()) {
			c.caseNordEst().couleur = "rouge";
		}
		if (c.caseSud().estColorié()) {
			c.caseSud().couleur = "rouge";
		}
		if (c.caseSudOuest().estColorié()) {
			c.caseSudOuest().couleur = "rouge";
		}
		if (c.caseSudEst().estColorié()) {
			c.caseSudEst().couleur = "rouge";
		}
		if (c.caseOuest().estColorié()) {
			c.caseOuest().couleur = "rouge";
		}
		if (c.caseEst().estColorié()) {
			c.caseEst().couleur = "rouge";
		}
	}
	
	public void jouerTemeraire() {
		// type de jeu temeraire pour l'humain
		Case c = this.choixCase();
		c.couleur = "rouge";
	}
}

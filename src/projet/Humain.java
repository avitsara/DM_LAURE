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
		if (c.caseNord().estColori�()) {
			c.caseNord().couleur = "rouge";
		}
		if (c.caseNordOuest().estColori�()) {
			c.caseNordOuest().couleur = "rouge";
		}
		if (c.caseNordEst().estColori�()) {
			c.caseNordEst().couleur = "rouge";
		}
		if (c.caseSud().estColori�()) {
			c.caseSud().couleur = "rouge";
		}
		if (c.caseSudOuest().estColori�()) {
			c.caseSudOuest().couleur = "rouge";
		}
		if (c.caseSudEst().estColori�()) {
			c.caseSudEst().couleur = "rouge";
		}
		if (c.caseOuest().estColori�()) {
			c.caseOuest().couleur = "rouge";
		}
		if (c.caseEst().estColori�()) {
			c.caseEst().couleur = "rouge";
		}
	}
	
	public void jouerTemeraire() {
		// type de jeu temeraire pour l'humain
		Case c = this.choixCase();
		c.couleur = "rouge";
	}
}

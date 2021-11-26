package projet;

public class Ordinateur extends Joueur {
/*=== ATTRIBUTS ===*/
	
/*=== CONSTRUCTEUR  ====*/	
	public Ordinateur(String nom, String couleur) {
		super(nom, couleur);
	}
	
/*=== METHODES ====*/
	public void jouerGloutonBrave() {
		// stratégie gloutonne brave
	}
	
	public void jouerGloutonTemeraire() {
		// stratégie gloutonne téméraire
	}
	
	public void jouerIATemeraire(){
		// 2ème stratégie (stratégie intelligente)
	}
	
	public void evalCaseBrave(Case c) {
		//évaluent le score de l'ordi selon la case passée en parmètre 
		// selon la règle Brave
	}
	
	public void evalCaseTemeraire() {
		// évaluent le score de l'ordi selon la case passée en parmètre 
		// selon la règle Téméraire
	}
	
	
}

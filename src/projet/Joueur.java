package projet;

import java.util.ArrayList;

public class Joueur {
/*=== ATTRIBUTS ===*/
	private String nom; 
	private String couleur;
	private int score; 
	private ArrayList<Case> caseOccupees = new ArrayList<Case>();
	private ArrayList<Case> caseNonOccupees = new ArrayList<Case>();
 
/*=== CONSTRUCTEUR  ====*/	
	public Joueur(String nom,String couleur) {
		this.nom = nom;
		this.couleur = couleur;
		this.score = 0;
	}
	
/*=== METHODES ====*/
	public int getScore() {
		return this.score;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public boolean caseEstOccupee(Case c) {
		boolean estOccupe = false;
		
		for (int i = 0; i < this.caseOccupees.size(); i++) { // parcours l'arrayList caseOccupees
			if (c == this.caseOccupees.get(i)) {
				return !estOccupe;
			}
		}
		
		return estOccupe;
	}
	
	public Case choixCase() {
		// choix d'une case parmi caseNonOccupees
		// case prend la couleur du joueur
		return null;
	}
	
	public void calculeScore() {
		int caseBleues = 0;
		int caseRouges = 0;
		
		for (int i = 0; i < this.caseOccupees.size(); i++ ) {// parcours l'arrayList caseOccupees
			if (this.caseOccupees.get(i).couleur == "bleu") {
				caseBleues ++;
			} else if (this.caseOccupees.get(i).couleur == "rouge") {
				caseRouges ++;
			}
		}
		System.out.println("Le score du joueur 1 est : " + caseRouges + ", le score de l'ordinateur est : " + caseBleues);
	}
	
	
	
	
}

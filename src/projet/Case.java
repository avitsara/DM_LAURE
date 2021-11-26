package projet;

import java.util.ArrayList;

public class Case {
/*=== ATTRIBUTS ===*/
	int x;
	int y;
	Grille grille;
	String couleur;
	
/*=== CONSTRUCTEUR  ====*/	
	public Case (int x, int y) {
		this.x = x;
		this.y = y;
		this.couleur = "blanc";
	}
	
/*=== METHODES ====*/
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public boolean estColorié() {
		if (this.couleur == "blanc") {
			return false;
		} else {
			return true;
		}
	}
	
	// retourne les coordonnées d'une case
	public ArrayList<Integer> getCoordonnees(){
		ArrayList<Integer> coordonnees = new ArrayList<Integer>();
		coordonnees.add(this.x);
		coordonnees.add(this.y);
		return coordonnees;
	}
	
	public Case caseNord() {
		// si coordonnee(x-1,y)=null, alors null
		// sinon x = x-1 
		if (x-1 < 0) {
			return null;
		} else {
			Case c = new Case(x-1,y);
			return c;
		}
		
		
	}
	
	public Case caseNordOuest() {
		// si coordonnee(x-1,y-1)=null, alors null
		// sinon x = x-1, y = y-1
		if ((x-1 < 0) || (y-1 < 0)) {
			return null;
		} else {
			Case c = new Case(x-1,y-1);
			return c;
		}
		
	}
	
	public Case caseNordEst() {
		// si coordonnee(x-1,y+1)=null, alors null
		// sinon x = x-1, y = y+1 
		if ((x-1 < 0) || (y+1 > grille.n)) {
			return null;
		} else {
			Case c = new Case(x-1,y+1);
			return c;
		}
		
	}
	
	public Case caseSud() {
		// si coordonnee(x+1,y)=null, alors null
		// sinon x = x+1 
		if (x+1 > grille.n) {
			return null;
		} else {
			Case c = new Case(x+1,y);
			return c;
		}
		
	}
	
	public Case caseSudOuest() {
		// si coordonnee(x+1,y-1)=null alors null
		// sinon x = x+1 y = y-1
		if ((x-1 < grille.n) || (y-1 < 0)) {
			return null;
		} else {
			Case c = new Case(x+1,y-1);
			return c;
		}
		
	}
	
	public Case caseSudEst() {
		// si coordonnee(x+1,y+1)=null, alors null
		// sinon x = x+1, y = y+1
		if ((x+1 > grille.n) || (y+1 > grille.n)) {
			return null;
		} else {
			Case c = new Case(x+1,y+1);
			return c;
		}
		
	}
	
	public Case caseOuest() {
		// si coordonnee(x,y-1)=null, alors null
		// sinon y = y-1 
		if (y-1 < 0) {
			return null;
		} else {
			Case c = new Case(x,y-1);
			return c;
		}
		
	}
	
	public Case caseEst() {
		// si coordonnee(x,y+1)=null, alors null
		// sinon y = y+1 
		if (y+1 > grille.n) {
			return null;
		} else {
			Case c = new Case(x,y+1);
			return c;
		}
		
	}
	
}

package projet;

public class Ordinateur extends Joueur {
/*=== ATTRIBUTS ===*/
	
/*=== CONSTRUCTEUR  ====*/	
	public Ordinateur(String nom, String couleur) {
		super(nom, couleur);
	}
	
/*=== METHODES ====*/
	public void jouerGloutonBrave() {
		// strat�gie gloutonne brave
	}
	
	public void jouerGloutonTemeraire() {
		// strat�gie gloutonne t�m�raire
	}
	
	public void jouerIATemeraire(){
		// 2�me strat�gie (strat�gie intelligente)
	}
	
	public void evalCaseBrave(Case c) {
		//�valuent le score de l'ordi selon la case pass�e en parm�tre 
		// selon la r�gle Brave
	}
	
	public void evalCaseTemeraire() {
		// �valuent le score de l'ordi selon la case pass�e en parm�tre 
		// selon la r�gle T�m�raire
	}
	
	
}

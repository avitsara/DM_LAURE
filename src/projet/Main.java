package projet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Saisie du nom du joueur
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nom.");
		String name = sc.nextLine();
		
		// joueurs pour la partie
		Humain humain = new Humain(name, "rouge");
		Ordinateur ordinateur = new Ordinateur("Ordinateur", "bleu");
		
		System.out.println("Voulez-vous jouer? (oui/non)");
		String jouer = sc.nextLine();
		
		if (jouer == "non") { // si le joueur ne veux pas jouer
			System.exit(0);
		}
		
		System.out.println("Voulez-vous un plateau partiellement rempli? (oui/non)");
		String plateau = sc.nextLine();
		
		if (plateau == "oui") {
			// prendre plateau du fichier
		} else {
			// créer plateau vide
		}
		
		System.out.println("Saisissez le mode de jeu. (brave, téméraire)");
		String mode = sc.nextLine();
		
		if (mode == "brave") {
			// boucle tant que pour continuer les manches
			
			// évalue une case blanche
			System.out.println("Souhaitez-vous évaluer une case blanche? (oui/non)");
			String evaluer = sc.nextLine();
			if(evaluer == "oui") {
				// faire appel a la même méthode que celle de l'ordinateur
			}
			
			humain.jouerBrave();
			ordinateur.jouerGloutonBrave();
			
			// demande d'afficher le score ou non
			System.out.println("Souhaitez-vous afficher le score? (oui/non)");
			String score = sc.nextLine();
			
			if(score == "oui") {
				System.out.println("Vous avez :");
				humain.getScore();
				System.out.println("points");
				System.out.println("L'ordinateur a :");
				ordinateur.getScore();
				System.out.println("points");
			}
			
		} else {
			System.out.println("Quelle stratégie prend l'ordinateur? (gloutonne/2ème stratégie)");
			String strategie = sc.nextLine();
			
			if (strategie == "gloutonne") {
				// boucle tant que pour continuer les manches
				
				// évalue une case blanche
				System.out.println("Souhaitez-vous évaluer une case blanche? (oui/non)");
				String evaluer = sc.nextLine();
				if(evaluer == "oui") {
					// faire appel a la même méthode que celle de l'ordinateur
				}
				
				humain.jouerTemeraire();
				ordinateur.jouerGloutonTemeraire();
				
				// demande d'afficher le score ou non
				System.out.println("Souhaitez-vous afficher le score? (oui/non)");
				String score = sc.nextLine();
				
				if(score == "oui") {
					System.out.println("Vous avez :");
					humain.getScore();
					System.out.println("points");
					System.out.println("L'ordinateur a :");
					ordinateur.getScore();
					System.out.println("points");
				}
			} else {
				// boucle tant que pour continuer les manches
				
				// évalue une case blanche
				System.out.println("Souhaitez-vous évaluer une case blanche? (oui/non)");
				String evaluer = sc.nextLine();
				if(evaluer == "oui") {
					// faire appel a la même méthode que celle de l'ordinateur
				}
				
				humain.jouerTemeraire();
				ordinateur.jouerIATemeraire();
				
				// demande d'afficher le score ou non
				System.out.println("Souhaitez-vous afficher le score? (oui/non)");
				String score = sc.nextLine();
				
				if(score == "oui") {
					System.out.println("Vous avez :");
					humain.getScore();
					System.out.println("points");
					System.out.println("L'ordinateur a :");
					ordinateur.getScore();
					System.out.println("points");
				}
				
			}
			
		}
	}

}

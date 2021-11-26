
public class Personne {
/*=== 	attributs ===*/
	private int age;
	private String prenom;
	protected String nom = "AVITSARA";
/*=== 	Constructeur  ===*/

	public Personne(String prenom,int age) {
		this.prenom = prenom;
		this.age = age;
	}
/*=== 	Méthodes   ===*/
	public void parler() {
		System.out.println("Je parle ");
	}

	
	public String toString() {
		return "prenom : " + this.prenom +
				" âge : " + this.age;
	}
}



<<<<<<< HEAD






























=======
public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + " �");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) { 
		 Romain Minus = new Romain("Minus", 8);
		 Minus.parler("ahhhhhh");
		 Minus.recevoirCoup(8);
	 }
}
>>>>>>> e6099c59ef68f09f42008cf6549fdf4c2af78d34

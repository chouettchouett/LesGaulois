package personnages;


public class Romain {
	private String nom;
	private int force;
	private int[2] equipement; // Comment qu'on fait ici ???
	private int nbEquipement = 0 ;

	public Romain(String nom, int force, int Equipement) {
		this.nom = nom;
		this.force = force;
		this.equipement = equipement;
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		if (forceCoup > 0) {
			force -= forceCoup;
			if (force > 0) {
				parler("Aïe");
			} else {
				parler("J'abandonne...");
			}
		}
	}
	
	public void sEquiper(equipement) {
		Romain romain(nom,force,equipement,nbequipement);
		
		switch case 1:{
			Romain romain(nom,force,["casque","bouclier"])) 
				return "Le soldat " + nom + " est déjà bien protégé !");
		
			
		if (Romain romain(nom,force,["bouclier"])) {
			return "Le soldat " + nom + " possède déjà un bouclier ! ");
		}
			
		if (Romain romain(nom,force,["casque"])) {
			return "Le soldat " + nom + " possède déjà un casque ! ");
			}
		
	}
	
	public enum Equipement{
		CASQUE("casque"),BOUCLIER("bouclier");
		private String nom;
		
		public String getNom() {
			return nom;
		}	
	}
	
	
	public static void main(String[] args) { 
		 Romain Minus = new Romain("Minus", 6);
		 //Minus.parler("ahhhhhh");
		 //Minus.recevoirCoup(8); 	
		 System.out.println("Test" + Equipement);
	 }
}

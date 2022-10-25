package personnages;


public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements; 
	private int nbEquipement = 0 ;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipement = new Equipement[2];
		assert (force>=0); //
	}

	public String getNom() {
		return nom;
	}
	public int getForce(){
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		int forceInit = force;
//		assert (forceCoup >= 0);
//		force -= forceCoup;
//		if (forceCoup > 0) {
//			if (force > 0) {
//				parler("Aïe");
//			} else {
//				parler("J'abandonne...");
//			}
//		}
//		assert(force<forceInitiale);
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// precondition
		assert force > 0;
		int departForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		//if (forceCoup > 0) {
		//	if (force > 0) {
		//		parler("Aïe");
		//	} else {
		//		parler("J'abandonne...");
		//	}
		//}
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		//post condition force plus petite
		assert force < departForce ;
		return  equipementEjecte;
	}
	
	
	
	public void sEquiper(Equipement equip) {
		switch (nbEquipement){
			case 2:
				presente(" est déjà bien protegee !");
				break;
			case 1:
				if( equip == equipements[0]){
					presente(" possede déjà un " + equip.getNom() );
				}
				else{
					equipe(equip);
				}
				break;
			case 0:
				equipe(equip);
				break;
				
			
	
	
	public static void main(String[] args) { 
		 Romain Minus = new Romain("Minus", 6);
		 //Minus.parler("ahhhhhh");
		 //Minus.recevoirCoup(8); 	
		 System.out.println("Test" + Equipement);
	 }
}

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
	
	private int calculResistanceEquipement(int forceCoup){
		String texte;
		texte = "Ma force est de " + this.force + ", et la dorce du coup est de "+ forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\n Mais heureusement, grâce à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++){
				if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)){
					resistanceEquipement += 8;
				}
				else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5
					}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	private Equipement[] ejecterEquipement(){
		Equipement[] equipementEjecte = new Equipement[nbEquipements];
		System.out.println("L'Equipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i ++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
		}
	
	public void presente(String text) {
		System.out.println("Le soldat " + nom + text + ".");
	}
	
	public void equipe(Equipement equip) {
		presente("s'equipe avec un " + equip.getNom() );
		nbEquipement ++;
		equipements[nbEquipement-1]=equip;
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
		}
	}
	
	@Override
	public String toString(){
		return "Romain [nom = " + nom +", force = " + force + "]";
	}
	
	public static void main(String[] args) { 
		Romain Minus = new Romain("Minus", 6);
		minus.nom = "minus";
		minus.force = 6;
		//Minus.parler("ahhhhhh");
		//Minus.recevoirCoup(8); 	
		System.out.println("Test" + Equipement);
	 }
}

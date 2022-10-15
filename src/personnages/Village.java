package personnages;


public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois ;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois villageois) {
		this.villageois[nbVillageois] = villageois;
		nbVillageois +=1;
	}
	
	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef" + chef + "vivent les légendaires gaulois :");
		for(int i =0; i <=nbVillageois; i++) {
			System.out.println(" -" + trouverHabitant(i).getNom() + ",");
		}
	
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		// System.out.println(village);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix",6);
		// Gaulois Gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		Gaulois Obelix = new Gaulois("Obelix", 25);
		Obelix.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}
	
}

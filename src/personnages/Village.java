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
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois +=1;
	}
	
	public Gaulois trouverHabitant(int index) {
		return villageois[index];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " habitent :");
		for(int i =0; i <=nbVillageois; i++) {
			System.out.println(" -" + villageois[i].getNom() + ",");
		}
	
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		// System.out.println(village);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix",6,1,village);
		village.setChef(Abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		// Gaulois Gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		// On reçoit les informations de Astérix, qui est le premier villageois gaulois
		// enregistre dans le village
		Gaulois Obélix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(Obélix);
		village.afficherVillageois();
	}
	
}

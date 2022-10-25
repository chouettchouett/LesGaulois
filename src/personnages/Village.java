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
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero - 1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans" + getNom() + " du chef" + chef.getNom() + "vivent les légendaires gaulois :");
		for(int i =0; i <=nbVillageois; i++) {
			System.out.println(" -" + villageois[i].getNom() + ".");
		}
	
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		// Gaulois Gaulois = village.trouverHabitant(30);
		// vide car aucun gaulois dans le village
		
		Chef Abraracourcix = new Chef("Abraracourcix",6,1,village);
		village.setChef(abraracourcix);
		
		// Gaulois Gaulois = village.trouverHabitant(1);
		// System.out.println(village);
		// On reçoit les informations de Asterix, qui est le premier villageois gaulois
		// enregistré dans le village
		Gaulois Obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}
	
}

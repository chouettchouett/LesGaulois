package personnages;

public class Scenario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois asterix = new Gaulois("Astérix", 10);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		Romain Minus = new Romain("Minus", 6);
		panoramix.parler("Je vais aller préparer une petite potion..." );
		panoramix.preparerPotion();
		panoramix.booster(Obélix);
		Obélix.parler("Par Bénélos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU");
		
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
	}

}


package personnages;

public class Scenario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix",5,10);
		Gaulois asterix = new Gaulois("Astérix", 10);
		Romain Minus = new Romain("Minus", 8);
		panoramix.parler("Je vais aller préparer une petite potion..." );
		Obelix.parler("Par Bénélos, ce n'est pas juste!");
		asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU");
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		
	}

}


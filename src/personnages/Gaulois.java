<<<<<<< HEAD
=======
package personnages;

 public class Gaulois  { 
	 private String nom; 
	 private int force; 
	 private int effetPotion = 1; 
	 
	 public Gaulois(String nom, int force) { 
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
		 return "Le gaulois " + nom + " : "; 
	 } 
	 public void frapper(Romain romain) { 
		 System.out.println(nom + " envoie un grand coup dans la m�choire de " 
				 + romain.getNom()); 
		 romain.recevoirCoup(force / 3); 
	 } 
	 
	 @Override 
	 public String toString() { 
		 return "Gaulois [nom=" + nom + ", force=" + force 
				 + ", effetPotion=" + effetPotion + "]"; 
	 } 
	 public static void main(String[] args) { 
		 Gaulois asterix = new Gaulois("Ast�rix", 8);
		 Romain Minus = new Romain("Minus", 8);
		 System.out.println(asterix);
		 asterix.parler("blabla");
		 asterix.frapper(Minus);
	 } 
	 
 }
 
>>>>>>> e6099c59ef68f09f42008cf6549fdf4c2af78d34
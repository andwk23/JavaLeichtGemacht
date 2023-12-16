package _09_ZugriffsModifikatoren;

public class Held_privatAttributes {
	// Attribute
	public String name;
	private int lebenspunkte;

	// Konstruktoren
	public Held_privatAttributes(int lebenspunkte) {
		super();
		if (lebenspunkte <= 100 && lebenspunkte > 0) {
			setLebenspunkte(lebenspunkte);
		} else {
			System.out.println("\n\tFalsche Eingabe!");
		}
	}
	// Methoden

	public int getLebenspunkte() {
		return this.lebenspunkte;
	}

	public void setLebenspunkte(int lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}
	public void setLebenspunkteÄndern(int schaden) {
		this.lebenspunkte -= schaden;
		if(this.lebenspunkte <= 0) {
			this.lebenspunkte = 0;
			System.out.println("\n\t*-* Unser Held ist tot!!! *-*" + "\n"
					+ "\tEr hat " + this.lebenspunkte + "!!!! Lebenspunkte");
		}
	}
	
}

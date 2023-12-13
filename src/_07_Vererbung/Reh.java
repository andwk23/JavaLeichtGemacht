package _07_Vererbung;

public class Reh extends Tier {
	// Atribute
	// Konstruktoren
	public Reh() {
	}

	public Reh(String name, double groesse, double gewicht) {
		super(name, groesse, gewicht);
	}

	@Override
	public void essen() {
		System.out.println("\n\tRehe äsen!");
	}

	// Methoden
	
}

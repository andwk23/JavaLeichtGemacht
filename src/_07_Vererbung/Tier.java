package _07_Vererbung;

public class Tier {
	// Attribute
	String name;
	double groesse;
	double gewicht;

	// Konstruktoren
	public Tier() {
	}

	public Tier(String name, double groesse, double gewicht) {
		this.name = name;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

	// Methoden
	public void essen() {
		System.out.print("\t" + this.name + " frißt: ");
	}
}

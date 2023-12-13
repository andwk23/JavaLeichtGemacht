package _07_Beispiele;

public class Auto {
	// Attribute
	String marke;
	int ps;
	int tuerenanzahl;
	String fahrzeugTyp;

	// Konstruktoren
	public Auto() {
	}

	public Auto(String marke, int ps, int tuerenanzahl, String fahrzeugTyp) {
		super();
		this.marke = marke;
		this.ps = ps;
		this.tuerenanzahl = tuerenanzahl;
		this.fahrzeugTyp = fahrzeugTyp;
	}

	// Methoden
	public void starten() {
		System.out.print("\nDer " + this.marke + " startet ");
	}
}

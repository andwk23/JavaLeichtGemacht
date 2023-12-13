package _06_Klassen_und_Objekte;

public class Auto_01 {

	// Attribute
	static int reifenanzahl = 4;
	
	int reifen;
	int preis;
	String marke;

	// Konstruktoren
	public Auto_01() {
	}

	public Auto_01(int reifen, int preis, String marke) {
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}

	// Methoden
	// Klassenmethoden
	public static void ausgabe() {
		System.out.println("\n--- Dies ist eine Klassenmethode und braucht kein Objekt!");
	}

	// Objektmethoden
	public void gasgeben() {
		System.out.println("\nDas Auto mit der Marke " + this.marke + " fährt jetzt los");
	}

	public void bremsen() {
		System.out.println("\nDas Auto mit der Marke " + this.marke + " bremst!");
	}

	public void vergleichePreis(double preis) {
		if (this.preis < preis) {
			System.out.println("\nDer " + this.marke + " ist billiger");
		} else {
			System.out.println("Der " + this.marke + " ist teurer");
		}
	}
}

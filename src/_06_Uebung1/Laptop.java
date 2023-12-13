package _06_Uebung1;

public class Laptop {
	// Attribute
	int ram;
	double preis;
	String marke;

	// Konstruktoren
	public Laptop() {
	}

	public Laptop(int ram, double preis, String marke) {
		super();
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}

	// Methoden
	public void eigenschaften() {
		System.out.println("\nMarke: " + this.marke + "\n"
				+ "Preis: " + this.preis + " €\n"
						+ "Ram: " + this.ram);
	}
}

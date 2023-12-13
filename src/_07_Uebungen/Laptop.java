package _07_Uebungen;

public class Laptop {
	// Attribute
	String marke;
	int ram;
	String cpu;
	double preis;

	// Konstruktoren
	public Laptop(String marke, int ram, String cpu, double preis) {
		super();
		this.marke = marke;
		this.ram = ram;
		this.cpu = cpu;
		this.preis = preis;
	}

	public Laptop() {

	}

	// Methoden
	@Override
	public String toString() {
		return "Laptop [marke=" + marke + ", ram=" + ram + ", cpu=" + cpu + ", preis=" + preis + "]";
	}
	public void starten() {
		System.out.println("\nDer " + this.marke + " wurde eingeschaltet!");
	}
}

package _07_Uebungen;

public class Lenovo extends Laptop {
	// Attribute
	boolean touchBar;
	// Konstruktoren

	public Lenovo() {
		super();
	}

	public Lenovo(int ram, String cpu, double preis, boolean touchBar) {
		super("Lenovo", ram, cpu, preis);
		this.touchBar = touchBar;
	}

	// Methoden

	@Override
	public void starten() {
		super.starten();
		System.out.println("\tDie LED leuchted");
	}

	@Override
	public String toString() {
		return "Marke=" + marke + "\nram=" + ram + "\ncpu=" + cpu + "\npreis=" + preis;
	}

}

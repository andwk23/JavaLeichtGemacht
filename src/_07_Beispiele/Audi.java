package _07_Beispiele;

public class Audi extends Auto {

	// Attribute
	boolean quattro;
	// Konstruktoren
	public Audi() {
		super();
	}

	public Audi(int ps, int tuerenanzahl, String fahrzeugTyp, boolean quattro) {
		super("Audi", ps, tuerenanzahl, fahrzeugTyp);
		this.quattro = quattro;
	}

	

	// Methoden
	@Override
	public void starten() {
		super.starten();
		System.out.println("auf Knopfdruck.");
	}
	
}

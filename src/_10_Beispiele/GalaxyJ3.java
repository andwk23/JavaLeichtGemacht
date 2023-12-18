package _10_Beispiele;

public class GalaxyJ3 extends Samsung implements ITelefon {

	// Attribute

	// Konstruktoren
	public GalaxyJ3() {
		super();
	}

	public GalaxyJ3(double preis, String produktTyp) {
		super(preis, produktTyp);
	}

	// Methoden
	@Override
	public void powerOn() {
		System.out.println("\n\tDas GalaxyJ3 wird an der rechten Seite eingeschalted,\n"
				+ "\tindem man den Power-Knopf 3 Sekunden drückt.");
	}

	@Override
	public boolean esKlingalt() {
		return false;
	}

	@Override
	public boolean anrufen() {
		return false;
	}
	// Attribute
	// Konstruktoren
	// Methoden

}

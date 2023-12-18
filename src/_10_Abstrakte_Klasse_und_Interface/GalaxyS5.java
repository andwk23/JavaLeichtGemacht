package _10_Abstrakte_Klasse_und_Interface;

public class GalaxyS5 implements ITelefon {
	// Atribute
	private String farbe;
	// Konstruktoren
	// Methoden

	@Override
	public void powerOn() {

	}

	@Override
	public boolean anrufen() {
		return false;
	}

	@Override
	public boolean esKlingelt() {
		return false;
	}
}

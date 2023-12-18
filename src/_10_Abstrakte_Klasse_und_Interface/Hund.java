package _10_Abstrakte_Klasse_und_Interface;

public class Hund extends TierKlasse_Abstrakt {
	// Atribute
	int zaehne;
	// Konstruktoren
	// public Hund() {
	// }

	public Hund(String name, double groesse, double gewicht, int zaehne) {
		super(name, groesse, gewicht);
		this.zaehne = zaehne;
	}

	// Methoden
	public void bellen() {
		System.out.println("\nHunde bellen");
	}

	@Override
	public void essen() {
		System.out.println("Manchmal schlingt er auch das Fressen runter!\n");
	}

	@Override
	public void atmen() {
		System.out.println("Der Hund ist ein Lungenatmer");
	}

}

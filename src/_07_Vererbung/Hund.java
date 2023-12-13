package _07_Vererbung;

public class Hund extends Tier {
	// Atribute
	int zaehne;
	// Konstruktoren
	public Hund() {
	}

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
		super.essen();
		System.out.println(" muss aber erst kauen. \n\t"
				+ "Manchmal schlingt er auch das Fressen runter!\n");
	}
	
}

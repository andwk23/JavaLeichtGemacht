package _07_Vererbung;

public class Kuh extends Tier {
	// Atribute
	static int hufe= 4;
	// Konstruktoren
	public Kuh() {
	}

	public Kuh(String name, double groesse, double gewicht) {
		super(name, groesse, gewicht);
	}

	@Override
	public void essen() {
		super.essen();
		System.out.println(" Kühe müssen aber noch wiederkäuen!");
	}

	// Methoden
	

}

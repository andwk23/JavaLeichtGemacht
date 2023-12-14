package _08_Uebungen;

public class Auto {
	// Attribute
	String autoMarke;
	Reifen reifen;

	// Konstruktoren
	public Auto() {

	}

	public Auto(String autoMarke, String reifenMarke, String reifenTyp) {
		super();
		reifen = new Reifen(reifenMarke, reifenTyp);
		this.autoMarke = autoMarke;
	}

	// Methoden
	public void ausgabeDaten() {
		System.out.println("\nDer " + this.autoMarke + " hat folgende Reifen:");
		System.out.println("\n\tReifenmarke: " + this.reifen.reifenMarke + "\n"
				+ "\tReifentyp: " + this.reifen.reifenTyp);
	}
}

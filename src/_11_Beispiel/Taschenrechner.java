package _11_Beispiel;

public class Taschenrechner {
	// Attribute

	// Konstruktoren
	public Taschenrechner() {
	}

	// Methoden
	public static void plus(int userZahl1, int userZahl2) {
		System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
	}

	public static void minus(int userZahl1, int userZahl2) {
		System.out.println("Ergebnis: " + (userZahl1 - userZahl2));
	}

	public static void dividiere(int userZahl1, int userZahl2) throws NichtDurchNullTeilenException {
		if (userZahl2 == 0) {
			throw new NichtDurchNullTeilenException("Durch Null teilen funktioniert nicht!");
		} else {
			System.out.println("Ergebnis: " + (userZahl1 / userZahl2));
		}

	}
}

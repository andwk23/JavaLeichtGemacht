package _04_Methoden;

public class Methoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ausgabe();
		summe();
		System.out.println("\n-------------------------------------------------------------------------");

		// Beispiele
		for (int i = 1; i <= 5; i++) {
			erstelleGegner(i);
		}
		System.out.println("\n-------------------------------------------------------------------------");
		erstelleGegner1("Heidi", 125);
		erstelleGegner1("Peter", 75);
	}

	public static void ausgabe() {
		System.out.println("\n*** Methoden können nicht innerhalb einer anderen Methode definiert werden! ***");
		System.out.println("--- Deshalb Definition ausserhalb der main-Methode! ---\n");
	}

	public static void summe() {
		int a, b, summe;
		a = 5;
		b = 5;

		summe = a + b;
		System.out.println("Summe = " + summe);
	}

	public static void erstelleGegner(int g) {
		String gegnerName = "Olaf" + g;
		int gegnerLeben = 100;
		System.out.println("\nGegner " + gegnerName + " wurde erstellt!");
		System.out.println(gegnerName + " hat " + gegnerLeben + " Lebenspunkte.");
	}

	public static void erstelleGegner1(String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("\nGegner " + gegnerName + " wurde erstellt!");
		System.out.println(gegnerName + " hat " + gegnerLeben + " Lebenspunkte.");
	}

}

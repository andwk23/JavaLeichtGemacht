package _04_Methoden;

public class Taschenrechner_in_Java {

	public static void main(String[] args) {
		System.out.println("\n*** Beispiel Taschenrechner mit Grundrechenarten ***");
		double z1 = 25.25;
		double z2 = 1.259;
		double z3 = 0.;
		
		System.out.println("\n--- Addition von " + z1 + " + " + z2 +" = " + taschenrechner(z1, z2, '+'));
		System.out.println("\n--- Subtraktion von " + z1 + " - " + z2 +" = " + taschenrechner(z1, z2, '-'));
		System.out.println("\n--- Multiplikation von " + z1 + " * " + z2 +" = " + taschenrechner(z1, z2, '*'));
		System.out.println("\n--- Division von " + z1 + " / " + z2 +" = " + taschenrechner(z1, z2, '/'));
		System.out.println("\n--- Division von " + z1 + " / " + z3 +" = " + taschenrechner(z1, z3, '/'));
		System.out.println("\n--- Modulo von " + z1 + " % " + z2 +" = " + taschenrechner(z1, z2, '%'));
	}

	public static double taschenrechner(double zahl1, double zahl2, char operator) {
		double ergebnis = 0;

		switch (operator) {
		case '+': {
			ergebnis = zahl1 + zahl2;
			break;
		}
		case '-': {
			ergebnis = zahl1 - zahl2;
			break;
		}
		case '*': {
			ergebnis = zahl1 * zahl2;
			break;
		}
		case '/': {
			if(zahl2 != 0) {
				ergebnis = zahl1 / zahl2;
			}else {
				System.out.println("\n*** Durch 0 kann nicht geteilt werden!!! ***");
				System.out.println("\tDeshalb nachfolgendes Divisionsergebnis = 0.0");
				ergebnis = 0.0;
			break;
			}
		}
		case '%': {
			ergebnis = zahl1 % zahl2;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		return ergebnis;
	}
}

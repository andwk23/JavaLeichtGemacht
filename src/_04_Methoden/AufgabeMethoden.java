package _04_Methoden;

public class AufgabeMethoden {

	public static void main(String[] args) {
		System.out.println("\n*** Erstelle Methode zum Multiplizieren von 3.547 und 6.354 ***\n");
		System.out.println("Die Multiplikation  von 3.547 und 6.354 ergibt: " + multZweiWere(3.547, 6.354));
	}
	public static double multZweiWere(double w1, double w2) {
		return (w1 * w2);
	}
}

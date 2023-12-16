package _09_ZugriffsModifikatoren;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n*** Attribut 'lebenspunkte' der Klasse Held mit public Zugriffsmodifikator initiiert ***");
		Held player1 = new Held();
		player1.lebenspunkte = 100;
		System.out.println("\nDer Held player1 hat " + player1.lebenspunkte + " Lebenspunkte");
		
		Held player2 = new Held();
		System.out.println("\n--- Bei public-Attributen können auch sinnfreie Werte vergeben werden! ---");
		player2.lebenspunkte = -100;
		System.out.println("\nDer Held player2 hat " + player2.lebenspunkte + "!!!! Lebenspunkte");
		
		System.out.println("\n------------------------------------------------------------------------------------");
		
		System.out.println("\n*** Attribut 'lebenspunkte' der Klasse Held_privatAttributes mit private Zugriffsmodifikator initiiert \n"
				+ "\tund Beschränkung auf sinnvolle Werte im Konstruktor ***");
		System.out.println("\n--- Bei falscher Eingabe wird darauf hingewiesen! ---");
		Held_privatAttributes player3 = new Held_privatAttributes(-100);
		player3.setLebenspunkte(56);
		System.out.println("\n--- Nach Eingabe eines korrekten Werts mit der set-Methode,\n "
				+ "\tkann der Wert mit der get-Methode ausgegeben werden ---\n");
		System.out.println("Der player3 hat " + player3.getLebenspunkte() + " Lebenspunkte.");
		
		System.out.println("\n------------------------------------------------------------------------------------");
		System.out.println("\n--- Änderung der Lebenspunkte mit der Methode setLebenspunkteÄndern(wert) ---");
		player3.setLebenspunkteÄndern(15);
		System.out.println("\n\tDer player3 hat noch " + player3.getLebenspunkte() + " Lebenspunkte.");
		
		System.out.println("\n--- Nach mehreren Schäden die unser Held player3 erlitten hat: ---");
		player3.setLebenspunkteÄndern(42);
		System.out.println("\n*-*-* PROGRAMMENDE *-*-*");
	}

}

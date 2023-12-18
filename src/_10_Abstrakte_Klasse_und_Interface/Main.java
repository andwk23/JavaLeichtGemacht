package _10_Abstrakte_Klasse_und_Interface;

public class Main {

	public static void main(String[] args) {
		// TierKlasse_Abstrakt tier = new TierKlasse_Abstrakt(); --- Klappt nicht, weil
		// Klasse abstrakt
		System.out.println("\n*** Abstrakte Klassen und deren Auswirkungen auf die davon abgeleiteten Objekte ***");
		System.out.println("-*-*-* Von einer abstrakten Klasse kann man keine Objekte ableiten -*-*-*");
		System.out.println("**-** In einer abstrakten Klasse kann es abstrakte Methoden geben **-**");
		Hund bello = new Hund("Bello", 18, 16, 42);
		bello.bellen();
		bello.atmen();
		bello.essen();
		
		Vogel pipmatz = new Vogel("Pipmatz", 2, 0.50);
		pipmatz.atmen();
		pipmatz.essen();
		
		System.out.println("\n-----------------------------------------------------------------------------\n");
		System.out.println("*** Infos zu Inteface ***");
		System.out.println("\n\t--- Der Name eines Interface fängt mit 'I' an. ---");
		System.out.println("\t--- Ein Interface enthält Attribute(nur Konstanten!) \n"
				+ "\t\tund (automatisch: abstrakte)Methodenköpfe. ---");
		System.out.println("\t--- Von einem Interface kann kein Objekt gebildet werden. ---");
		System.out.println("\n-----------------------------------------------------------------------------\n");
		System.out.println("Im Interface(static) hinterlegter Netzanbieter: " + ITelefon.NETZANBIETER);
	}

}

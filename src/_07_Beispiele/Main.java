package _07_Beispiele;

public class Main {

	public static void main(String[] args) {
		BMW x1 = new BMW(130, 4, "Limousine", true);
		System.out.println("\nFolgendes Auto wurde erstellt:");
		System.out.println("------------------------------");
		System.out.println("Marke: " + x1.marke + "\n"
				+ "Anzahl Türen: " + x1.tuerenanzahl + "\n"
				+ "Typ: " + x1.fahrzeugTyp + "\n"
				+ "PS: " + x1.ps + "\n"
				+ "XDrive: " + x1.xDrive);
		x1.starten();
		
		Audi a3 = new Audi(210, 4, "SUV", true);
		System.out.println("\nFolgendes Auto wurde erstellt:");
		System.out.println("------------------------------");
		System.out.println("Marke: " + a3.marke + "\n"
				+ "Anzahl Türen: " + a3.tuerenanzahl + "\n"
				+ "Typ: " + a3.fahrzeugTyp + "\n"
				+ "PS: " + a3.ps + "\n"
				+ "Quattro " + a3.quattro);
		a3.starten();
	}

}

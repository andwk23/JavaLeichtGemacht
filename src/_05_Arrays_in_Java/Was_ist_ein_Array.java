package _05_Arrays_in_Java;

public class Was_ist_ein_Array {

	public static void main(String[] args) {
		System.out.println("\n*** Deklarationsmöglichkeiten für ein Array ***\n");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("--- Arrayerstellung mit Angabe der Elementanzahl ---");
		System.out.println("\tint[] zahlenArray = new int[7];");
		int[] zahlenArray = new int[7];
		System.out.println("\tZuweisung an zahlenArray[0]");
		zahlenArray[0] = 189;
		System.out.println("\tAusgabe von zahlenArray[0]: " + zahlenArray[0]);
		System.out.println("\n--- Die Elemente sind je nach Datentyp vorbelegt");
		System.out.println("--- Ausgabe aller Elemente von zahlenArray[], \n"
				+ "    sowohl mit zugewiesenen als auch vorbelegten Elementen");
		for(int i=0;i<7;i++) {
			System.out.println("\tElement " + i + " ist: " + zahlenArray[i]);
		}
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("--- Arrayerstellung mit direkter Zuweisung ---");
		System.out.println("\tDatentyp[] Name = {e1, e2, e3, ......};");
		String[] personA = {
				"Peter",
				"Müller",
				"35"
		};
		System.out.println("\n--- Ausgabe der im Array erfaßten Personendaten: ");
		System.out.println("Vorname: " + personA[0] + "\n"
				+ "Nachname: " + personA[1] + "\n"
						+ "Alter: " + personA[2]);
		int[] zahlen = new int[2];
		zahlen[0] = 17;
		zahlen[1] = 37;
		for(int i=0; i<2;i++) {
			System.out.println(zahlen[i]);
		}
	}

}

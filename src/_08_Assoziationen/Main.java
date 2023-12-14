package _08_Assoziationen;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n*** Computer mit Standardkonstruktor erstellt ***");
		Computer cp1 = new Computer();
		System.out.println("\n--- Mainboard noch nicht zugewiesen, deswegen Adresse von cp1.mainboard: " + cp1.mainboard);
		
		Mainboard board1 = new Mainboard();
		System.out.println("--- Adresse des Mainboards: " + board1);
		
		cp1.mainboard = board1;
		System.out.println("--- Adresse des Mainboards von cp1 nach Zuweisung: " + board1);
		
		System.out.println("\n------------------------------------------------------------------------------\n");
		System.out.println("*** Computer mit parametrisiertem Konstruktor erstellt nach Erstellung \n"
				+ "\teines Objekts vom Typ Mainboard ***");
		
		Mainboard board2 = new Mainboard();
		Computer cp2 = new Computer("Intel", board2, 512.50);
		System.out.println("\nFolgende Eigenschaften hat unser Computer:\n"
				+ "\tCPU: " + cp2.cpu + "\n\tMainboard: " + cp2.mainboard + "\n\tPreis: " + cp2.preis);
		
		System.out.println("\n------------------------------------------------------------------------------\n");
		System.out.println("*** Beispiele für Computer ***");
		System.out.println("\n--- Zuerst werden 2 Mainboards vollständig erstellt ---");
		
		Mainboard mainboardAsus = new Mainboard(4, 2, 4);
		Mainboard mainboardAsrock = new Mainboard(2, 1, 2);
		
		System.out.println("Das Asus Mainboard hat folgende Eigenschaften: ");
		System.out.println("\tRamslots: " + mainboardAsus.ramSlots + "\n"
				+ "\tKartenslots: " + mainboardAsus.kartenSlots + "\n"
				+ "\tUSBpotrs: " + mainboardAsus.ubsPorts);
		System.out.println("\nDas Asrock Mainboard hat folgende Eigenschaften: ");
		System.out.println("\tRamslots: " + mainboardAsrock.ramSlots + "\n"
				+ "\tKartenslots: " + mainboardAsrock.kartenSlots + "\n"
				+ "\tUSBpotrs: " + mainboardAsrock.ubsPorts);
		
		System.out.println("\n--- Jetzt können die Computer von Peter und Olga vollständig dargestellt werden ---");
		
		Computer computerPeter = new Computer("Intel", mainboardAsus, 400.75);
		Computer computerOlga  = new Computer("AMD", mainboardAsrock, 350.20);
		
		System.out.println("\nPeters Computer:");
		System.out.println("\tCPU: " + computerPeter.cpu + "\n"
				+ "\tMainboard: Asus" + "\n"
						+ "\t\tKartenslots: " + computerPeter.mainboard.kartenSlots + 
						"\n\t\tRAMslots: " + computerPeter.mainboard.ramSlots + "\n"
						+ "\t\tUSBports: " + computerPeter.mainboard.ubsPorts
						+ "\n\tPreis: " + computerPeter.preis);
		
		System.out.println("\nOlgas Computer:");
		System.out.println("\tCPU: " + computerOlga.cpu + "\n"
				+ "\tMainboard: Asrock" + "\n"
						+ "\t\tKartenslots: " + computerOlga.mainboard.kartenSlots + 
						"\n\t\tRAMslots: " + computerOlga.mainboard.ramSlots + "\n"
						+ "\t\tUSBports: " + computerOlga.mainboard.ubsPorts
						+ "\n\tPreis: " + computerOlga.preis);
		
		System.out.println("\n------------------------------------------------------------------------------\n");
		System.out.println("\n*** Computer Konstruktor, der einen Mainboardkonstruktor anstößt ***");
		
		Computer computerOlaf = new Computer("Intel", 4, 4, 8, 825.60);
		System.out.println("\nOlafs Computer:");
		System.out.println("\tCPU: " + computerOlaf.cpu + "\n"
				+ "\tMainboard: Asrock-prime" + "\n"
						+ "\t\tKartenslots: " + computerOlaf.mainboard.kartenSlots + 
						"\n\t\tRAMslots: " + computerOlaf.mainboard.ramSlots + "\n"
						+ "\t\tUSBports: " + computerOlaf.mainboard.ubsPorts
						+ "\n\tPreis: " + computerOlaf.preis);
	}

}

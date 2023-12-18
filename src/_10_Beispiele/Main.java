package _10_Beispiele;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n*** Samsung-Smarthones aus der Superklasse 'Samsung' \n"
				+ "\tund dem Interface 'ITelefon' ***");
		System.out.println("---------------------------------------------------------------------");
		GalaxyJ3 petersGalaxy = new GalaxyJ3(620.55, "Smartphone");
		System.out.println("\nWie schaltet Peter sein Smartphone ein?");
		petersGalaxy.powerOn();
		GalaxyS5 petrasGalaxy = new GalaxyS5(828.60, "Smartphone");
		System.out.println("\nWie schaltet Petra ihr Smartphone ein?");
		petrasGalaxy.powerOn();
		System.out.println("\nPetras Handy ist ein " + petrasGalaxy.getProduktTyp() + ",\n"
				+ "und es kostete " + petrasGalaxy.getPreis() + " €.");
		System.out.println("\nDie Simkarte von Petra ist von: " + petrasGalaxy.NETZANBIEER_2);
	}

}

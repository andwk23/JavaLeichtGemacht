package _07_Beispiele;

public class BMW extends Auto {

	// Attribute
	boolean xDrive;

	// Konstruktoren
	public BMW() {
		super();
	}

	public BMW(int ps, int tuerenanzahl, String fahrzeugTyp, boolean xDrive) {
		super("BMW", ps, tuerenanzahl, fahrzeugTyp);
		this.xDrive = xDrive;
	}

	@Override
	public void starten() {
		super.starten();
		System.out.println("mit einer Fernbedienung.");
	}

	// Methoden
	
}

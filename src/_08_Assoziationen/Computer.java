package _08_Assoziationen;

public class Computer {

	// Attribute
	String cpu;
	Mainboard mainboard;
	double preis;

	// Konstruktoren
	public Computer() {
	}

	public Computer(String cpu, Mainboard mainboard, double preis) {
		super();
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.preis = preis;
	}

	public Computer(String cpu,int ramSlots, int kartenSlots, int usbPorts, double preis) {
		super();
		mainboard = new Mainboard(ramSlots, kartenSlots, usbPorts);
		this.cpu = cpu;
		this.preis = preis;
	}
	
	
	// Methoden
}

package _10_Beispiele;

public class GalaxyS5 extends Samsung implements ITelefon {
	// Attribute
	private String farbe;

	// Konstruktoren
	public GalaxyS5() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GalaxyS5(double preis, String produktTyp) {
		super(preis, produktTyp);
		// TODO Auto-generated constructor stub
	}
	// Methoden

	@Override
	public void powerOn() {
		System.out.println("\tDas GalaxyS5 wird an der oberen Seite eingeschalted,\n"
				+ "\tindem man lange den Power-Knopf gedrückt hält.");

	}

	@Override
	public boolean esKlingalt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anrufen() {
		// TODO Auto-generated method stub
		return false;
	}
}

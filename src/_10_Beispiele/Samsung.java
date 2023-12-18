package _10_Beispiele;

public abstract class Samsung {
	// Attribute
	private double preis;
	private String produktTyp;

	// Konstruktoren
	public Samsung() {
	}

	public Samsung(double preis, String produktTyp) {
		super();
		this.setPreis(preis);
		this.setproduktTyp(produktTyp);
	}

	// Methoden
	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getProduktTyp() {
		return produktTyp;
	}

	public void setproduktTyp(String produktTyp) {
		this.produktTyp= produktTyp;
	}
}

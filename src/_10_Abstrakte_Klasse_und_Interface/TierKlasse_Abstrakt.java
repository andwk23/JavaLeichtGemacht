package _10_Abstrakte_Klasse_und_Interface;

public abstract class TierKlasse_Abstrakt {
	// Attribute
	String name;
	double groesse;
	double gewicht;

	// Konstruktoren
	// public TierKlasse_Abstrakt() {
	// }

	public TierKlasse_Abstrakt(String name, double groesse, double gewicht) {
		this.name = name;
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

	// Methoden
	public abstract void essen();

	public abstract void atmen();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

}

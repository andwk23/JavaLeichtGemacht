package _10_Abstrakte_Klasse_und_Interface;

public interface ITelefon {
	// Attribute, nur Konstanten
	public static final String NETZANBIETER = "1&1";
	// Methodenköpfe
	public void powerOn();
	public boolean anrufen();
	public boolean esKlingelt();

}

package _10_Abstrakte_Klasse_und_Interface;

public class Vogel extends TierKlasse_Abstrakt {

	public Vogel(String name, double groesse, double gewicht) {
		super(name, groesse, gewicht);
	}

	@Override
	public void essen() {
		System.out.println("Der Vogel pickt sein Essen");

	}

	@Override
	public void atmen() {
		System.out.println("Der Vogle hat Lungen");

	}

}

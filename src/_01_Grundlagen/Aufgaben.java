package _01_Grundlagen;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Aufgaben {

	public static void main(String[] args) {
		
		int autoPreis1 = (int)3500;
		int autoPreis2 = (int)2340.48f;
		int autoPreis = autoPreis1 + autoPreis2;
		int alter = (int)18;
		String vorname = "Peter";
		String nachname = "Müller";
		
		System.out.println("Auto-Preis: " + autoPreis1 + "\nAlter: " + alter +
				"\nVorname: " + vorname + "\nNachname: " + nachname);
		System.out.println("Gesamtpreis beider Autos: " + autoPreis + "€");

	}

}

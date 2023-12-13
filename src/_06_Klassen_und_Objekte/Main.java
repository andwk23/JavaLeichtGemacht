package _06_Klassen_und_Objekte;

public class Main {

	public static void main(String[] args) {
		Auto bmw = new Auto();
		System.out.println("Ein neues Objekt der Klasse Auto wurde erstellt: \n\t" + bmw);

		bmw.marke = "BMW";
		bmw.preis = 5000;
		System.out.println("\nMarke: " + bmw.marke + "\nPreis: " + bmw.preis);

		Auto_01 vw = new Auto_01();
		System.out.println("\nDer Standardkonstruktor belegt die Parameter folgendermaßen:");
		System.out.println("\tMarke: " + vw.marke + "\n\tPreis: " + vw.preis + "\n\tReifen: " + vw.reifen);

		Auto_01 bmw01 = new Auto_01(4, 5400, "BMW_5er");
		System.out.println("\nNeues Auto mit parametrisiertem Konstruktor:");
		System.out.println("\tMarke: " + bmw01.marke + "\n\tPreis: " + bmw01.preis + "\n\tReifen: " + bmw01.reifen);

		bmw01.gasgeben();
		bmw01.bremsen();
		vw.marke = "VW-Bulli";
		vw.preis = 4100;
		vw.vergleichePreis(400.15);

		Auto_01.ausgabe();
		System.out.println("\n-*- Klassenmethoden können auch von Objekten aufgerufen werden!");
		System.out.println("Klassenmethodenaufruf vom Objekt 'vw'");
		vw.ausgabe();
		
		System.out.println("\n*** --- Klassenattribute werden mit Erstellen der Klasse erstellt! ---***");
		System.out.println("Reifenanzahl ist ein Klassenattribut aller Autos: " + Auto_01.reifenanzahl);
	}

}

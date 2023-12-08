package _02_Scannerklasse;

import java.util.Scanner;

public class Einlesen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\tEine Zahl eingeben (Kommazahlen mit Komma statt Punkt): ");
		double zahl=scan.nextDouble();
		System.out.println("\tDie Eingabe war: " + zahl);
		
		
		System.out.println("\n--- Einen String von der Tastatur einlesen ---\n");
		Scanner scan2 = new Scanner(System.in);
		System.out.println("\tEine Zeichenkette eingeben");
		String varString = scan2.nextLine();
		System.out.println("\tEingegeben wurde: " + varString);
		
		System.out.println("\n--- Einen Character von der Tastatur einlesen ---\n");
		Scanner scan4 = new Scanner(System.in);
		System.out.println("\tEinen Character eingeben");
		char varChar = scan4.next().charAt(0) ;
		System.out.println("\tEingegeben wurde: " + varChar);
		
		System.out.println("\n--- Übung III - Die Klasse Scanner ---");
		Scanner scan3 = new Scanner(System.in);
		System.out.println("\tGebe dein Alter an: ");
		int varAlter = scan3.nextInt();
		System.out.println("\tGib deinen Vornamen an:");
		String varName = scan3.next();
		scan.close();
		System.out.println("\tDu heißt: " + varName + "\n\tDein Alter ist: " + varAlter);
	}

}

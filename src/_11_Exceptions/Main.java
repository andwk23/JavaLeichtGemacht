package _11_Exceptions;

import java.util.Scanner;

import _11_Beispiel.NichtDurchNullTeilenException;
import _11_Beispiel.Taschenrechner;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n*** Taschenrechner mit try und catch um Fehler abzufangen ***\n");
		
		System.out.println("--- Addition (3+6), Division (20/2) und Division (20/0)");
		try {
			Taschenrechner.plus(3, 6);
			Taschenrechner.dividiere(20, 2);
			Taschenrechner.dividiere(20, 0);			
		}
		catch(Exception e) {
			System.out.println("Folgender Fehler ist aufgetreten: " + e);
			e.printStackTrace();
		}
		System.out.println("\nProgramm läuft weiter");
		
		System.out.println("\n--- Division nach Nutzereingabe mit Fehler abfangen---");
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Zahl1 eingeben ...");
			int userZahl1 = scan.nextInt();
			System.out.println("Zah2 eingeben ...");
			int userZahl2 = scan.nextInt();
			
			Taschenrechner.dividiere(userZahl1, userZahl2);
		}catch (NichtDurchNullTeilenException e){
			/*
			 * System.out.println("*-* Durch 0 kann nicht geteilt werden! *-*");
			 * System.out.println("Zwei neue Zahlen eingeben: ");
			 */
			/*
			 * int eingabe1 = scan.nextInt(); int eingabe2 = scan.nextInt();
			 */
			
			System.out.println(e.getMessage());
			/*
			 * try { Taschenrechner.dividiere(eingabe1, eingabe2); } catch
			 * (NichtDurchNullTeilenException e1) { e1.printStackTrace(); }
			 */
		}
		System.out.println("\nProgramm läuft weiter und wird beendet");
	}

}

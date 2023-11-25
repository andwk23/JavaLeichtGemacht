package _01_Grundlagen;

public class Typumwandlung_Casten {

	public static void main(String[] args) {
		int userAlter = (int)18.5;  // (int) = castoperator
		System.out.println(userAlter);
		
		
		
		// Implizites Casten (von klein nach groß) Keine Datenverluste
		// Umwandlung findet bei Zuweisung statt
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);
	
		
		// Explizite Casten (von groß nach klein) Datenverluste
		// Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt 
		
		// 1. Auto = 3450,45€  2. Auto = 2690,94€
		int autoPreis1 = (int)3450.45;
		int autoPreis2 = (int)2690.94;
		
		int gesamtPreis = autoPreis1 + autoPreis2;
		System.out.println(gesamtPreis);

	}

}

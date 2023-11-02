package _01_Grundlagen;

public class Beispiele_char_boolean {

public static boolean geklickt(String geklickt) {
	if (geklickt == "Nicht geklickt"){
		return false;}
	else {
		return true;}
}

public static void main(String[] args) {


		
		System.out.println("\n*** Nutzen von Unicodezeichen aus der Tabellle von 'unicode-table.com' ***");
		System.out.println("--------------------------------------------------------------------------\n");
		
		char charUnicode = '\u00A9'; // Aus Tabelle: U+00A9 wird in java in \u00A9 umgewandelt
		System.out.println("Das Bild unterliegt dem " + charUnicode);
		
		boolean userKlick = false;
		
		System.out.println("\n*** Eine boolean-Variable zum Anzeigen einer Auswhl oder Änderung ***");
		System.out.println("---------------------------------------------------------------------\n");
		
		String klick = "Nicht geklickt";
		
		userKlick = geklickt(klick);
		System.out.println("Geklickt: " + klick + " ==> " + " Änderung: " + userKlick);
		
		klick = "geklickt";
		userKlick = geklickt(klick);
		System.out.println("Geklickt: " + klick + " ==> " + " Änderung: " + userKlick);
		

	}

}

package _09_Beispiele;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n*** Anlegen und Ausgabe eines Benutzerkontos mit private-Attributen ***");
		System.out.println("--- Als Standardpasswort ist '0000' vorgegeben ---");
		GoogleKonto peter = new GoogleKonto("Peter", "0000");
		System.out.println("\nSie sind mit folgenden Daten eingeloggt:" + "\n"
				+ "Benutzername: " + peter.getBenutzerName() + "\n"
				+ "Passwort: " + peter.getPasswort());
		
		GoogleKonto petra = new GoogleKonto("Petra", "0000");
		System.out.println("\nSie sind mit folgenden Daten eingeloggt:" + "\n"
				+ "Benutzername: " + petra.getBenutzerName() + "\n"
				+ "Passwort: " + petra.getPasswort());

	}

}

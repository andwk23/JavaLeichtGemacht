package _09_Beispiele;

import java.util.Scanner;

public class GoogleKonto {
	// Attribute
	private String benutzerName;
	private String passwort = "0000";

	// Konstruktoren
	public GoogleKonto() {
	}

	public GoogleKonto(String benutzerName, String passwort) {
		super();
		setBenutzerName(benutzerName);
		setPasswort(passwort);
	}

	// Methoden
	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		
		if(passwort.equals(this.passwort)) {
			System.out.println("\nAltes Passwort von " + this.benutzerName + " stimmt und kann geändert werden");
			System.out.println("\tBitte ein neues Passwort eingeben ...");
			Scanner scan = new Scanner(System.in);
			String newPasswort = scan.nextLine();
			this.passwort = newPasswort;
		}else {
			System.out.println("Passwort falsch, kann nicht geändert werden!");
		}
		
	}
}

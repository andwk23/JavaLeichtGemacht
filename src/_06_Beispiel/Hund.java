package _06_Beispiel;

public class Hund {
	// Attribute
	String name;
	int alter;
	String rasse;
	
	// Konstruktoren
	public Hund() {
	}
	public Hund(String name, int alter, String rasse) {
		super();
		this.name = name;
		this.alter = alter;
		this.rasse = rasse;
	}
	// Methoden
	public void bellen() {
		System.out.println("Der Hund " + this.name + " bellt");
	}

}

package _07_Vererbung;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n *** Vererbung ***");
		
		Hund bello = new Hund();
		bello.name = "Bello";
		bello.essen();
		
		Kuh olga = new Kuh();
		olga.name = "Olga";
		
		Hund klara = new Hund("Klara", 16.5, 6.3, 42);
		olga.essen();
		System.out.println("\n\tKühe haben " + Kuh.hufe + " Hufe");
		
		Kuh karla = new Kuh("Karla", 150, 600.2);
		karla.essen();
		
		Reh bambi = new Reh();
		bambi.essen();
	}

}

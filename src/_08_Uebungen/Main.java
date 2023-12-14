package _08_Uebungen;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n*** Erstellen von 2 Autoobjekten ***");
		System.out.println("------------------------------------");

		Auto bmw = new Auto("BMW", "Goodyear", "Winterreifen");
		Auto vw = new Auto("VW", "Michelin", "Sommerreifen");

		bmw.ausgabeDaten();
		vw.ausgabeDaten();
	}

}

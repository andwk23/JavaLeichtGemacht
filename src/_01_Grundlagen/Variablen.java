package _01_Grundlagen;

public class Variablen {

	public static void main(String[] args) {
		
		System.out.println("\n*** Variablen ***");
		System.out.println("-----------------\n");
		
		boolean userKlick = false;
		char zeichen = '!';
		int highscore = 0;
		
		System.out.println("--- Anfangswerte der Variablen ---");
		System.out.println("\tuserKlick = " + userKlick + "\n\thighscore = " + highscore);
		
		highscore = 10;
		
		System.out.println("\n--- nach Änderung von Variablen ---");
		System.out.println("\tuserKlick = " + userKlick + "\n\thighscore = " + highscore);
		

	}

}

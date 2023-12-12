package _03_Kontrollstrukturen;

public class for_while_Schleifen {

	public static void main(String[] args) {
		System.out.println("\n*** Die 'for-Schleife' ***\n");
		System.out.println("--- Suche die Zahl 5 ---\n");
		
		for (int i = 3; i <= 7; i++) {
			if (i == 5) {
				System.out.println("\n\t*** i = " + i + ". Du hast die 5 gefunden! ***\n");
			}
			else {
				System.out.println("i = " + i + ". Das ist nicht die gesuchte Zahl!");
			}
		}
		
		System.out.println("\n\n*** Die 'while-Schleife' mit 'true' und 'break' ***\n");
		System.out.println("--- Suche die Zahl 7 ---\n");
		
		int zahl = 5;
		while(true) {
			if (zahl == 7) {
				System.out.println("\n\t*** zahl = " + zahl + ". Du hast die 7 gefunden! ***\n");
			}
			else if (zahl==9) {
				System.out.println("\n\t***** PROGRAMMENDE *****");
				break;
			}
			else {
				System.out.println("zahl = " + zahl + ". Das ist nicht die gesuchte Zahl!");
			}
			zahl++;
		}
		
	}

}

package Kontrollstrukturen;

import java.util.Scanner;

public class IF_Else_Switch_Case {

	public static void main(String[] args) {
		int score = 4999;
		
		System.out.println("\n--- Einfache if-else-Verzweigung ---\n");
		for(int i = 0;i <= 2; i++) {
			if(score > 5000) {
				System.out.println("Neuer Rekord mit " + score + " Punkten");
			}else {
				System.out.println("Score = " + score + " - kein neuer Rekord");
			}
			score++;
		}
		
		System.out.println("\n--- Verzweigung mit 'if', 'else if' und 'else' ---\n");
		int zahl = 10;
		for (int i = 9; i <= 11; i++) {
			if (i<zahl) {
				System.out.println(i + " ist kleiner als " + zahl);
			}else if (i==zahl){
				System.out.println(i + " ist gleich " + zahl);
			}else if (i>zahl){
				System.out.println(i + " ist größer als " + zahl);
			}else {
				System.out.println("Eingabe- oder Programmfehler");
			}
		}
		
		System.out.println("\n\n*** 'switch-case-Kontrollstruktur' für int, char und String ***\n");
		System.out.println("\n--- Quizfrage: 'Wie viele Bundesländer hat Deutschland?' ---");
		System.out.println("\tAuswahl: '3', '15', '16', '30'\n");
		System.out.println("Bitte geben Sie ihre Antwort ein: ");
		Scanner scan = new Scanner(System.in);
		int eingabe = scan.nextInt();

		switch (eingabe) {
		case 3: {
			System.out.println(eingabe + " ist leider falsch");
			break;
		}
		case 15: {
			System.out.println(eingabe + " ist leider falsch");
			break;
		}
		case 16: {
			System.out.println(eingabe + " ist richtig");
			break;
		}
		case 30: {
			System.out.println(eingabe + " ist leider falsch");
			break;
		}
		default:
			System.out.println(eingabe + " ist bei diesem Quiz nicht vorgesehen!");
		}
		
		scan.close();
		System.out.println("\n***** PROGRAMMENDE *****");
	}

}

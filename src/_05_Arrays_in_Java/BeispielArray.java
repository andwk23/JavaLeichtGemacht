package _05_Arrays_in_Java;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class BeispielArray {

	public static void main(String[] args) {
		System.out.println("\n*** Eingabe von Lottozahlen in ein Array ***\n");
		int[] lottoZahlen = new int[6];
		
		for(int i=0; i < lottoZahlen.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lottozahl " + (i+1) + " eingeben: ");
			int userZahl = scan.nextInt();
			lottoZahlen[i] = userZahl;
		}
		System.out.println("\n--- Die Lottozahlen sind ---");
		for(int i=0; i < lottoZahlen.length; i++) {
			System.out.println("\t" + lottoZahlen[i]);
		}
		
		System.out.println("\n--------------------------------------------------------------------\n");
		System.out.println("*** Ein kleines Mathequiz ***");
		
		String[] fragen = {
				"Wie viel ist 5 + 4?",
				"Wie viel ist 5 * 4?",
				"Wie viel ist 6 / 3?"
		};
		int[] antworten = {9,20,2};
		
		int counter = 0;
		while (counter < fragen.length) {
			System.out.println("\n" + fragen[counter]);
			Scanner scan = new Scanner(System.in);
			int userEingabe = scan.nextInt();
			if(userEingabe == antworten[counter]) {
				System.out.println(antworten[counter] + " ist richtig");
			}else {
				System.out.println(userEingabe + " ist falsch");
			}
			counter++;
		}
	}

}

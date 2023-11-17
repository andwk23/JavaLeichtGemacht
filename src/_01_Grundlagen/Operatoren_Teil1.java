package _01_Grundlagen;

public class Operatoren_Teil1 {

	public static void main(String[] args) {
		
		System.out.println("\n*** Operatoren 1 ***");
		System.out.println("--------------------\n");
		
		System.out.println("--- Arithmetische Operatoren ---");
		double zahl1 = 10;
		double zahl2 = 5;
		int zahl = 10;
		
		System.out.println("\tAddition '+'");
		System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1+zahl2));
		System.out.println("\tSubtraktion '-'");
		System.out.println(zahl1 + " - " + zahl2 + " = " + (zahl1-zahl2));
		System.out.println("\tMultiplikation '*'");
		System.out.println(zahl1 + " * " + zahl2 + " = " + (zahl1*zahl2));
		System.out.println("\tDivision '/'");
		System.out.println(zahl1 + " / " + zahl2 + " = " + (zahl1/zahl2));
		System.out.println("\tInkrementieren'++'");
		System.out.print(zahl + "++" + " = ");
		zahl++;
		System.out.println(zahl);
		System.out.println("\tDekrementieren'--'");
		System.out.print(zahl + "--" + " = ");
		zahl--;
		System.out.println(zahl);
		

	}

}

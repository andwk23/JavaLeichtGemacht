package _01_Grundlagen;

public class intFloatDouble {

	public static void main(String[] args) {
		
		int varInt = 10 / 3;
		float varFloat = 10f / 3;
		double varDouble = 10d / 3;
		
		System.out.println("*** Genauigkeit von Zahlen ***");
		System.out.println("----------------------------\n");
		
		System.out.println("--- Genauigkeit ohne Formatierung ---");
		System.out.println(String.format("Integer: %3d\nFloat:     %.7f\n"
				+ "Double:    %.16f", varInt, varFloat, varDouble));
		System.out.println("\n--- Ausgabe mit mehr Nachkommastellen ---");
		System.out.println(String.format("Integer: %3d\nFloat:     %.8f\n"
				+ "Double:    %.17f", varInt, varFloat, varDouble));
	}

}

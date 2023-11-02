package _01_Grundlagen;

public class Datentypen {

	public static void main(String[] args) {
		System.out.println("\n*** In Java gibt es 8 primitive Datentypen ***");
		System.out.println("----------------------------------------------\n");
		
		System.out.println("--- Der Datentyp 'byte' ---");
		byte byteBeispiel = 23;
		byte byteMaximum = Byte.MAX_VALUE;
		byte byteMinimum = Byte.MIN_VALUE;
		System.out.println("\tBeispiel: " + byteBeispiel);
		System.out.println("\tMaximum:  " + byteMaximum + "\n\tMinimum: " + byteMinimum);
		
		System.out.println("\n--- Der Datentyp 'short' ---");
		short shortBeispiel = 2523;
		short shortMaximum = Short.MAX_VALUE;
		short shortMinimum = Short.MIN_VALUE;
		System.out.println("\tBeispiel: " + shortBeispiel);
		System.out.println("\tMaximum:  " + shortMaximum + "\n\tMinimum: " + shortMinimum);
		
		System.out.println("\n--- Der Datentyp 'integer' ---");
		int integerBeispiel = 5523;
		int integerMaximum = Integer.MAX_VALUE;
		int integerMinimum = Integer.MIN_VALUE;
		System.out.println("\tBeispiel: " + integerBeispiel);
		System.out.println("\tMaximum:  " + integerMaximum + "\n\tMinimum: " + integerMinimum);
		
		System.out.println("\n--- Der Datentyp 'long' ---");
		long longBeispiel = 5523;
		long longMaximum = Long.MAX_VALUE;
		long longMinimum = Long.MIN_VALUE;
		System.out.println("\tBeispiel: " + longBeispiel);
		System.out.println("\tMaximum:  " + longMaximum + "\n\tMinimum: " + longMinimum);
		
		System.out.println("\n--- Der Datentyp 'float' ---");
		float floatBeispiel = 132583f;
		float floatMaximum = Float.MAX_VALUE;
		float floatMinimum = Float.MIN_VALUE;
		System.out.println("\tBeispiel: " + floatBeispiel);
		System.out.println("\tMaximum:  " + floatMaximum + "\n\tMinimum:  " + floatMinimum);
		
		System.out.println("\n--- Der Datentyp 'double' ---");
		double doubleBeispiel = 15896583;
		double doubleMaximum = Float.MAX_VALUE;
		double doubleMinimum = Float.MIN_VALUE;
		System.out.println("\tBeispiel: " + doubleBeispiel);
		System.out.println("\tMaximum:  " + doubleMaximum + "\n\tMinimum:  " + doubleMinimum);
		
		System.out.println("\n--- Der Datentyp 'boolean' ---");
		boolean booleanBeispiel = true;
		boolean booleanMaximum = Boolean.TRUE;
		boolean booleanMinimum = Boolean.FALSE;
		System.out.println("\tBeispiel: " + booleanBeispiel);
		System.out.println("\tMaximum:  " + booleanMaximum + "\n\tMinimum:  " + booleanMinimum);
		
		System.out.println("\n--- Der Datentyp 'char' ---");
		char charBeispiel = 'A';
		char charMaximum = Character.MAX_SURROGATE;
		char charMinimum = Character.MIN_VALUE;
		System.out.println("\tBeispiel: " + charBeispiel);
		System.out.println("\tMaxSurrogate:  " + charMaximum + "\n\tMinimum:  " + charMinimum);

	}

}

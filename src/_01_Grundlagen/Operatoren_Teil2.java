package _01_Grundlagen;

public class Operatoren_Teil2 {

	public static void main(String[] args) {
		System.out.println("\n*** Operatoren 2 ***");
		System.out.println("--------------------\n");
		
		System.out.println("--- Vergleichs Operatoren ---");
		
		int a = 3;
		int b = 3;
		boolean c = false;
		
		System.out.println("\tWerte auf Gleichheit prüfen '=='");
		System.out.println("c" + " = " + a +  "==" + b + " ==> " + (a==b));
		System.out.println("\tWerte auf Ungleichheit prüfen '!='");
		System.out.println("c" + " = " + a +  "!=" + b + " ==> " + (a!=b));
		System.out.println("\tAuf Größer prüfen '>'");
		System.out.println("c" + " = " + a +  ">" + b + " ==> " + (a>b));
		System.out.println("\tAuf Größer gleich prüfen '>='");
		System.out.println("c" + " = " + a +  ">=" + b + " ==> " + (a>=b));
		System.out.println("\tAuf Kleiner prüfen '<'");
		System.out.println("c" + " = " + a +  "<" + b + " ==> " + (a<b));
		System.out.println("\tAuf Kleiner gleich prüfen '<='");
		System.out.println("c" + " = " + a +  "<=" + b + " ==> " + (a<=b));
		
		System.out.println("--- Zuweisungs Operatoren ---");
		System.out.println("Zuweisung: a" + " = " + "6");
		System.out.println("--- Additionszuweisung ---");
		System.out.println(a + " += " + b + " ==> " + (a+=b));
		System.out.println("--- Subtraktionszuweisung ---");
		System.out.println(a + " -= " + b + " ==> " + (a-=b));
		System.out.println("--- Multiplikationszuweisung ---");
		System.out.println(a + " *= " + b + " ==> " + (a*=b));
		System.out.println("--- Divisionsszuweisung ---");
		System.out.println(a + " /= " + b + " ==> " + (a/=b));
		
		System.out.println("--- Logische Operatoren ---");
		System.out.println("Logisches Und: " + c + " && (" + a + " == " + b + ")" + " ==> " + (c && (3==3)));
		System.out.println("Logisches Oder: " + c + " || (" + a + " == " + b + ")" + " ==> " + (c || (3==3)));

	}

}

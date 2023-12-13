package _07_Uebungen;

public class Main {

	public static void main(String[] args) {

		Lenovo t500 = new Lenovo(8000, "AMD Ryzen 5", 622.40, true);
		System.out.println(t500.toString());
		t500.starten();
	}

}

package de.hslu.bw140.v04aAnweisungenTeil1;
public class P6FloatingArithmetik {
	public static void main(String[] args) {

		// Ganzzahlige Konstanten:
		System.out.println(20 / 8);
		// Floatingpoint-Konstanten
		System.out.println(20.0 / 8.0);
		// Polymorphismus: Das selbe Sprachkonstrukt wird abhängig vom Kontext
		// in verschiedene Mechanismen umgesetzt

		// Bei Variablen hängt es vom Typ der Variablen ab:
		int a = 20, b = 8, c;
		c = a / b;
		System.out.println(c);

		double d = 20, e = 8, f;
		f = d / e;
		System.out.println(f);

	}
}
package de.hslu.bw140.v04aAnweisungenTeil1;
public class P3MinutenSeitTagesbeginn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aktuelleUhrzeit = 1217; // in der Form hhmm, aber ohne führende 0
		int stunden, minuten;
		stunden = aktuelleUhrzeit / 100;
		minuten = aktuelleUhrzeit % 100;

		int GesamteMinuten = stunden * 60 + minuten;
		// Zeichenkette als Konstante ist vom Typ String in "
		System.out.print("Minuten seit Tagesbeginn: ");
		System.out.println(GesamteMinuten);
	}

}

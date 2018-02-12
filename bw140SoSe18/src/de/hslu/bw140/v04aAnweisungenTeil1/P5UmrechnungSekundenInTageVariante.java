package de.hslu.bw140.v04aAnweisungenTeil1;
public class P5UmrechnungSekundenInTageVariante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sekunden = 201217;
//  Zusammenhänge werden nur einmal als Konstante definiert:
		final int SEKUNDENPROMINUTE = 60;
		final int MINUTENPROSTUNDE = 60;
		final int STUNDENPROTAG = 24;
		
		int minuten, restlicheSekunden;
		minuten = sekunden / SEKUNDENPROMINUTE;
		restlicheSekunden = sekunden % SEKUNDENPROMINUTE;

		int stunden, restlicheMinuten;
		stunden = minuten / MINUTENPROSTUNDE;
		restlicheMinuten = minuten % MINUTENPROSTUNDE;

		int tage, restlicheStunden;
		tage = stunden / STUNDENPROTAG;
		restlicheStunden = stunden % STUNDENPROTAG;

//  Verschiedene Dinge in der Ausgabe kombinieren mit + ("Polymorphismus")
		System.out.print(sekunden + " Sekunden sind "+ tage + " Tage, ");
		System.out.print(restlicheStunden + " Stunden, " + restlicheMinuten);
		System.out.println(" Minuten und " + restlicheSekunden + " Sekunden");

		System.out.print("Die Probe ergibt: ");
		int sekundenFuerProbe = (((tage * STUNDENPROTAG) + restlicheStunden) // Stunden
				* MINUTENPROSTUNDE + restlicheMinuten) // Minuten
				* SEKUNDENPROMINUTE + restlicheSekunden;
		System.out.println(sekundenFuerProbe);
	}

}

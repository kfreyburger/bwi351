package de.hslu.bw140.v04aAnweisungenTeil1;
public class P4UmrechnungSekundenInTage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sekunden = 201217;

		int minuten, restlicheSekunden;
		minuten = sekunden / 60;
		restlicheSekunden = sekunden % 60;

		int stunden, restlicheMinuten;
		stunden = minuten / 60;
		restlicheMinuten = minuten % 60;

		int tage, restlicheStunden;
		tage = stunden / 24;
		restlicheStunden = stunden % 24;

		System.out.print(sekunden);
		System.out.print(" Sekunden sind ");
		System.out.print(tage);
		System.out.print(" Tage, ");
		System.out.print(restlicheStunden);
		System.out.print(" Stunden, ");
		System.out.print(restlicheMinuten);
		System.out.print(" Minuten und ");
		System.out.print(restlicheSekunden);
		System.out.println(" Sekunden");

		System.out.print("Die Probe ergibt: ");
		int sekundenFuerProbe = (((tage * 24) + restlicheStunden) // Stunden
				* 60 + restlicheMinuten) // Minuten
				* 60 + restlicheSekunden;
		System.out.println(sekundenFuerProbe);
	}

}

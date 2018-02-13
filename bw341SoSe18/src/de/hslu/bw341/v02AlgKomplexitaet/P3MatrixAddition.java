package de.hslu.bw341.v02AlgKomplexitaet;

public class P3MatrixAddition {
	public static void main(String[] args) {

		int[][] aMatrix = { { 1, 2, 3 }, 
				                { 4, 5, 6 } };
		// Anzahl Zeilen aMatrix.length
		// Anzahl Spalten aMatrix[0].length
		
		int[][] bMatrix = { { 7, 8, 9 }, 
				                { 10, 11, 12 } };

		int[][] ergebnisMatrix = new int[aMatrix.length][aMatrix[0].length];

		// Berechnung
		for (int zeilen = 0; zeilen < aMatrix.length; zeilen++)
			for (int spalten = 0; spalten < aMatrix[0].length; spalten++)
				ergebnisMatrix[zeilen][spalten] = aMatrix[zeilen][spalten]
						+ bMatrix[zeilen][spalten];

		// Ausgabe
		System.out.println("Das Ergebnis lautet:");
		for (int zeilen = 0; zeilen < ergebnisMatrix.length; zeilen++) {
			for (int spalten = 0; spalten < ergebnisMatrix[0].length; spalten++)
				System.out.print(ergebnisMatrix[zeilen][spalten] + " ");
			System.out.println();
		}
	}
}
package de.hslu.bw341.v03Suchen;

public class P1LineareSuche {
	public static void main(String[] args) {
		int[] folge = { 3, 1, 5, 9, 7 };
		int sucheigenschaft = 9;

		int resultat = -1;
		for (int i = 0; resultat == -1 && i < folge.length; i++) {
			if (folge[i] == sucheigenschaft) {
				resultat = i;
			}
		}
		System.out.println(resultat);

		// Ausgabe ein wenig hübscher:
		if (resultat != -1)
			System.out.println("Die gesuchte Zahl " + sucheigenschaft
					+ " steht an Stelle " + resultat);
		else
			System.out.println("Die gesuchte Zahl " + sucheigenschaft
					+ " kommt nicht in dem Array vor");

		// Test Commit
	}
}
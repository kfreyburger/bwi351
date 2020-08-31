package de.hwglu.bwi351_1.v02AlgKomplexitaet;

public class P2ErsteLoesung {
	public static void main(String[] args) {
		int[] folge = { 5, -8, 3, 3, -5, 7, -2, -7, 3, 5 };

		// maximale Teilsumme ist mindestens 0 (Summe der leeren Teilfolge)
		int maxTeilsumme = 0;

		for (int anfang = 0; anfang < folge.length; anfang++) {
			for (int ende = anfang; ende < folge.length; ende++) {
				int Teilsumme = 0;
				for (int element = anfang; element <= ende; element++)
					Teilsumme = Teilsumme + folge[element];
				if (Teilsumme > maxTeilsumme)
					maxTeilsumme = Teilsumme;
			}
		}
		System.out.println(maxTeilsumme);
	}
}
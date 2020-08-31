package de.hwglu.bwi351_1.v05Rekursion;

public class P2FakultaetTestausgabe {
	// Fakultaet von n (rekursiv)
	static long fak(long n) {
		System.out.println("Aufruf von f(" + n + ")");
		long ergebnis;
		if (n == 0 || n == 1)
			ergebnis = 1;
		else
			ergebnis = n * fak(n - 1);
		System.out.println("Rückkehr f(" + n + ")= " + ergebnis);
		return ergebnis;

	}

	public static void main(String[] args) {
		int i = 5;
		System.out.println("fak(" + i + "): rekursiv: " + fak(i));
	}
}
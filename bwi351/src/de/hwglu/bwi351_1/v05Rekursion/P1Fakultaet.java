package de.hwglu.bwi351_1.v05Rekursion;

public class P1Fakultaet {
	// Fakultaet von n (rekursiv)
	static long fak(long n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * fak(n - 1);
	}

	// Fakultaet von n (iterativ)
	static long fakIterativ(long n) {
		if (n == 0 || n == 1)
			return 1;
		long fak = 1;
		for (long i = 2; i <= n; i++)
			fak = fak * i;
		return fak;
	}

	public static void main(String[] args) {
		for (long i = 1; i <= 20; i++)
			System.out.println("fak(" + i + "): rekursiv: " + fak(i) + ", iterativ: "
					+ fakIterativ(i));
		// Versuch einer Laufzeiteinschäzung
		long i = 20;
		System.out.println("fib(" + i + "): iterativ: " + fakIterativ(i));
		System.out.println("fib(" + i + "): rekursiv: " + fak(i));

	}
}
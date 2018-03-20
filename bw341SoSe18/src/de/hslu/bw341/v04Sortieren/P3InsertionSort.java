package de.hslu.bw341.v04Sortieren;

public class P3InsertionSort {
	public static void main(String[] args) {
		int[] folge = { 5, 1, 8, 3, 9, 2 };

		System.out.println("Das Array zu Beginn: ");
		for (int i = 0; i < folge.length; i++)
			System.out.print(" " + folge[i]);
		System.out.println();

		for (int i = 1; i < folge.length; i++) {
			int aktuelleZahl = folge[i], j;
			for (j = i - 1; j >= 0 && folge[j] > aktuelleZahl; j--)
				folge[j + 1] = folge[j];
			folge[j + 1] = aktuelleZahl;
		}

		System.out.println("Das Array am Ende: ");
		for (int i = 0; i < folge.length; i++)
			System.out.print(" " + folge[i]);
	}
}
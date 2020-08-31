package de.hwglu.bwi351_1.v02AlgKomplexitaet;

public class P4ZeitfuerRaum {
  public static void main(String[] args) {
    int[] folge = {5,-8,3,3,-5,7,-2,-7,3,5};

//  s definieren und leere Matrix erzeugen
    int[][] s = new int[folge.length][folge.length];

//  s füllen
    for (int anfang = 0; anfang < folge.length; anfang++) {
      s[anfang][anfang] = folge[anfang];
      for (int ende = anfang +1; ende < folge.length; ende++) {
        s[anfang][ende] = s[anfang][ende-1]+folge[ende];
      }
    }

 // maximale Teilsumme bestimmen
    int maxTeilsumme = 0;
    for (int anfang = 0; anfang < folge.length; anfang++) {
      for (int ende = anfang; ende < folge.length; ende++) {
        if (s[anfang][ende] > maxTeilsumme)
          maxTeilsumme = s[anfang][ende];
      }
    }
    System.out.println(maxTeilsumme);

  }
}
package de.hslu.bw341.v07Baeume03;

public class Testprogramm {
  public static void main(String[] args) {
    Suchbaum b = new Suchbaum();
// 1. Beispiel:
/*
    b.einfuegen(6);
    b.einfuegen(3);
    b.einfuegen(1);
    b.einfuegen(5);
    b.einfuegen(9);
    b.einfuegen(7);
    b.einfuegen(10);
    b.einfuegen(4);
     b.loeschen(1);
 //   b.loeschen(5);
 //   b.loeschen(10);
 //   b.loeschen(3);
*/

// 2. Beispiel:

    b.einfuegen(6);
    b.einfuegen(2);
    b.einfuegen(1);
    b.einfuegen(5);
    b.einfuegen(3);
    b.einfuegen(9);
    b.einfuegen(7);
    b.einfuegen(10);
    b.einfuegen(11);
    b.einfuegen(4);

    b.loeschen(6);
    int i = 1;   // für Break-Punkt!
  }
}
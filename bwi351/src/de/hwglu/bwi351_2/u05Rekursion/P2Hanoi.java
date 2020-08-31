package de.hwglu.bwi351_2.u05Rekursion;

public class P2Hanoi {
  static void bewege(int von, int nach) {
   System.out.println("Eine Scheibe von Stapel " + von + " nach Stapel " + nach);
  }
  static void hanoi(int groesse, int von, int nach, int arbber) {
// hier kommt der Algorithmus rein


//  so wird die Bewegung einer einzelnen Scheibe abgebildet
        bewege(von, nach);

  }

  public static void main(String[] args) {
    hanoi(3,1,3,2);
  }
}
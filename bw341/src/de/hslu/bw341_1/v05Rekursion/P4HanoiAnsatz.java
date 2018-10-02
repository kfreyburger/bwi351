package de.hslu.bw341_1.v05Rekursion;

public class P4HanoiAnsatz {

	 // Bewege eine Scheibe
  public static void bewege1 (int von, int nach) {
  	System.out.println("Eine Scheibe von Stapel " + von + " nach Stapel " + nach);
  }

  // Bewege zwei Scheiben. Benutze die Lösung für 1 Scheibe
  public static void bewege2 (int von, int nach, int arbber) {
    bewege1 (von, arbber);       //  (I) 
    bewege1 (von, nach);       //  (II)
    bewege1 (arbber, nach);         //  (III)
  }

  // Bewege drei Scheiben. Benutze die Lösung für 2 Scheiben
  public static void bewege3 (int von, int nach, int arbber) {
    bewege2 (von, arbber, nach); //  (I)
    bewege1 (von, nach);       //  (II)  
    bewege2 (arbber, nach, von); //  (III)
  }
  
  public static void main (String[] args) {
    // von = Stapel 0, nach = Stapel 2, arbber = Stapel 1 
    bewege3 (0, 2, 1);
  }
}

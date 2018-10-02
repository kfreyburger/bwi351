package de.hslu.bw341_1.v08Entwurf;

public class P1QuickSort {
  static void swap (int[] feld, int i, int j) {
    int temp = feld[i];
    feld[i] = feld[j];
    feld[j] = temp;
  }

  public static void printArray(int[] feld) {
    for (int i = 0; i < feld.length; i++)
      System.out.print ( feld[i] + " " );
    System.out.println();
  }

  static void qsort (int[] feld, int anfang, int ende) {
    
    if (anfang < ende) {
    	int unten = anfang, oben = ende;
      // Pivotelement bestimmen
      int pivot = feld[(unten + oben) / 2];
      while (unten <= oben) {
        // Erstes Element suchen, das größer oder gleich dem
        // Pivotelement ist, beginnend vom linken Index
        while (feld[unten] < pivot)
          unten++;
        // Element suchen, das kleiner oder gleich dem
        // Pivotelement ist, beginnend vom rechten Index
        while ( feld[oben] > pivot)
          oben--;
        // Wenn Indexe nicht gekreuzt --> Inhalte vertauschen
        if (unten <= oben) {
          swap(feld, unten, oben);
          unten++;
          oben--;
        }
      }
      // Linke Partition sortieren
        qsort (feld, anfang, oben);
      // Rechte Partition sortieren
        qsort( feld, unten, ende);
    }
  }

  public static void main(String[] args) {
    int[] feld = { 4, 9, 2, 5, 3, 7,	8};
//    int[] feld = { 2, 6, 4, 5, 7, 9, 8};
//    int[] feld = { 8, 2, 1,5,9, 7,3 };

    qsort (feld, 0, feld.length - 1);
    printArray(feld);
  }

}
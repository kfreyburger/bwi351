package de.hwglu.bwi351_1.v03Suchen;

public class P2LineareSucheAlternativ {
  public static void main(String[] args) {
    int[] folge = { 3, 1, 5, 9, 7};
    int sucheigenschaft = 19;

    int i = 0;
    while (i < folge.length && folge[i] != sucheigenschaft) {
      i++;
    }
    
    if ( i < folge.length )
      System.out.println("Die gesuchte Zahl "+ sucheigenschaft+
                          " steht an Stelle "+i);
    else
      System.out.println("Die gesuchte Zahl "+ sucheigenschaft +
                          " kommt nicht in dem Array vor");

  }
}
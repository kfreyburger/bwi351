package de.hslu.bw341_2.u06Liste;

public class ListeTestprogramm {
  public static void main(String[] args) {
    Liste L = new Liste ();

    L.einfuegenEnde(5);
    L.einfuegenAnfang(25);
    L.einfuegenAnfang(10);
    L.einfuegenEnde(15);

    System.out.println("Das Maximum der Liste lautet "+L.max());

    int sucheigenschaft = 25;
    if (L.suchen(sucheigenschaft))
      System.out.println("Die Zahl "+sucheigenschaft+" kommt in der Liste vor");
     else
       System.out.println("Die Zahl "+sucheigenschaft+" kommt nicht in der Liste vor");

  }
}
package de.hslu.bw341_2.u06Liste;

public class Liste {
  private Knoten anker;

  public Liste() {
    this.anker = null;
  }

  public void einfuegenAnfang (int Zahl) {
    this.anker = new Knoten (Zahl, this.anker);
  }

  public void einfuegenEnde (int Zahl) {
    if ( this.anker != null ) {
//  Suche Knoten, dessen Nachfolger auf null zeigt
      Knoten k = this.anker;
      while ( k.Nf != null)
        k = k.Nf;
//  Knoten gefunden --> bekommt nun einen Knoten angehängt
      k.Nf = new Knoten (Zahl, null);
    }
    else
//  Sonderbehandlung zur Vermeidung von java.lang.NullPointerException
      this.einfuegenAnfang(Zahl);
  }

  public boolean suchen(int schluessel) {

  //  hier kommt der Algorithmus rein

      return false;
  }

  public int max() {
    int result = Integer.MIN_VALUE;

//  hier kommt der Algorithmus rein

    return result;

  }
  public void loeschenAnfang() {
//  hier kommt der Algorithmus rein

  }

}
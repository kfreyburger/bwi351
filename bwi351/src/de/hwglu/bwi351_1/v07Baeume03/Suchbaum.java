package de.hwglu.bwi351_1.v07Baeume03;

public class Suchbaum {
  Knoten wurzel;

  public Suchbaum() {
    wurzel = null;
  }

  public void einfuegen(int wert) {
    Knoten n = new Knoten(wert, null, null);
    if (wurzel == null)
      wurzel = n;
    else {
       Knoten temp = wurzel;
       Knoten parent = null;
// suche einen freien Platz
       while (temp != null) {
         parent = temp;
         if ( n.wert > temp.wert )
           temp = temp.rechts;
         else   //wenn der Wert schon vorhanden wird links eingetragen
           temp = temp.links;
       }
//    neuen Knoten eintragen:
       if ( n.wert > parent.wert )
           parent.rechts = n;
         else
           parent.links = n;
    }
  }

  public boolean loeschen(int wert) {
//  Leerer Baum --> es kann nicht gelöscht werden
    if (wurzel == null)
      return false;

//  zu löschenden Knoten suchen:
    Knoten zuloeschen = wurzel;
    Knoten parent = zuloeschen;
    Knoten child;

    while ( zuloeschen !=  null && zuloeschen.wert != wert) {
      parent = zuloeschen;
      if (wert > zuloeschen.wert)
        zuloeschen = zuloeschen.rechts;
      else
        zuloeschen = zuloeschen.links;
    }
    if (zuloeschen.wert != wert)
//  es wurde kein entsprechender Knoten gefunden
      return false;

//  der Knoten zuloeschen muss nun gelöscht werden
//  einfachster Fall: der Knoten hat keine Kinder

    if (zuloeschen.links == null && zuloeschen.rechts == null)
//    leeren Knoten zum Einhängen vormerken
      child = null;
    else if (zuloeschen.links == null)
//linker Teilbaum leer --> rechten Teilbaum vormerken
      child = zuloeschen.rechts;
    else if (zuloeschen.rechts == null)
//rechter Teilbaum leer --> linken Teilbaum vormerken
       child = zuloeschen.links;
    else {
//  beide Teilbäume gefüllt --> linkes Blatt im rechten Teilbaum suchen
       child = zuloeschen.rechts;
       Knoten parentChild = zuloeschen;  //zusätzlich auch diesen Elternknoten merken
       while (child.links != null) {
         parentChild = child;
         child = child.links;
       }
//     linkes Blatt gefunden;
       if (zuloeschen.rechts != child) {
//     wenn das linke Blatt NICHT unmittelbar unter dem zu löschenden
//     Knoten hängt, ist folgendes zu tun:
//      - einen evtl. rechten Teilbaum bei dem Parent eintragen (links)
//      - rechts den alten rechten Teilbaum des zu löschenden Knoten eintragen
         parentChild.links = child.rechts;
         child.rechts = zuloeschen.rechts;
       }
//     Linker Teilbaum des zu löschenden Knoten (immer) eintragen:
       child.links = zuloeschen.links;
    }

//  schließlich Kind im Elternknoten einhängen
    if (zuloeschen == wurzel)   //Wurzel ist zu löschen
      wurzel = child;      // neuen Knoten statt der Wurzel eintrgagen
    else if (zuloeschen == parent.rechts)   //Knoten steht rechts
      parent.rechts = child;
    else                               // Knoten steht links
      parent.links = child;

//  Löschen hat funktioniert
    return true;
  }

  private Knoten sucheKnoten(int wert) {
    Knoten temp = wurzel;
    while ( temp !=  null) {
      if (wert == temp.wert )
        return temp;
      else if (wert > temp.wert)
        temp = temp.rechts;
      else
        temp = temp.links;
    }
    return null;
  }
  public boolean suche(int wert){
    return (sucheKnoten(wert) != null);
  }

  private void printInorder (Knoten k) {
    if ( k != null ) {
      printInorder(k.links);
      System.out.print(k);
      printInorder(k.rechts);
    }
  }
  public void printInorder() {
    printInorder(wurzel);
    System.out.println();
  }
  private void printPreorder (Knoten k) {
    if ( k != null ) {
      System.out.print(k);
      printPreorder(k.links);
      printPreorder(k.rechts);
    }
  }
  public void printPreorder() {
    printPreorder(wurzel);
    System.out.println();
  }
  private void printPostorder (Knoten k) {
    if ( k != null ) {
      printPostorder(k.links);
      printPostorder(k.rechts);
      System.out.print(k);
    }
  }
  public void printPostorder() {
    printPostorder(wurzel);
    System.out.println();
  }
}
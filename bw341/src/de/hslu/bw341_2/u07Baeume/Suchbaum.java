package de.hslu.bw341_2.u07Baeume;

public class Suchbaum {
  Knoten wurzel;

  public Suchbaum() {
    this.wurzel = null;
  }

  public int einfuegen(double wert) {
//  gibt Höhe zurück
    Knoten n = new Knoten(wert, null, null);
    int res = 1;
    if (this.wurzel == null)
    	this.wurzel = n;
    else {
       Knoten temp = this.wurzel;
       Knoten parent = null;
// suche einen freien Platz
       while (temp != null) {
         parent = temp;
         if ( n.wert > temp.wert )
           temp = temp.rechts;
         else   //wenn der Wert schon vorhanden wird links eingetragen
           temp = temp.links;
         res++;
//  temp ist im letzten Durchlauf null --> res hat dann den Wert des
//  neuen Knotens
       }
//    neuen Knoten eintragen:
       if ( n.wert > parent.wert )
           parent.rechts = n;
         else
           parent.links = n;
    }
     return res;
  }

}
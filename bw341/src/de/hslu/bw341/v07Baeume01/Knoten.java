package de.hslu.bw341.v07Baeume01;

public class Knoten {
   char wert;       // Nutzinhalt
   Knoten links, rechts;

   public String toString() {
      return " "+this.wert;
   }

   public Knoten (char wert, Knoten links, Knoten rechts) {  // Konstruktor
     this.wert = wert;
     this.links = links;
     this.rechts = rechts;
   }
}


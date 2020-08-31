package de.hwglu.bwi351_1.v07Baeume03;

public class Knoten {
   int wert;       // Nutzinhalt
    Knoten links, rechts;

    public String toString() {
      return " "+wert;
    }

    public Knoten (int wert, Knoten links, Knoten rechts) {  // Konstruktor
      this.wert = wert;
      this.links = links;
      this.rechts = rechts;
    }
}
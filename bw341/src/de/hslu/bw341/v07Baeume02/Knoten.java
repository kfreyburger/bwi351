package de.hslu.bw341.v07Baeume02;

public class Knoten {
   int wert;       // Nutzinhalt
    Knoten links, rechts;

    public String toString() {
      return " "+this.wert;
    }

    public Knoten (int wert, Knoten links, Knoten rechts) {  // Konstruktor
      this.wert = wert;
      this.links = links;
      this.rechts = rechts;
    }
}
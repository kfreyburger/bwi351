package de.hslu.bw341_2.u07Baeume;

public class Knoten {
    double wert;       // Nutzinhalt
    Knoten links, rechts;  //Kinder

    public Knoten (double wert, Knoten links, Knoten rechts) {  // Konstruktor
      this.wert = wert;
      this.links = links;
      this.rechts = rechts;
    }
}
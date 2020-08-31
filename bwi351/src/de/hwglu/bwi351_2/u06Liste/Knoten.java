package de.hwglu.bwi351_2.u06Liste;

public class Knoten {
  int Zahl;
  Knoten Nf;    //Nachfolger

  public Knoten(int Zahl, Knoten Nf) {
    this.Zahl = Zahl;
    this.Nf = Nf;
  }
}
package de.hslu.bw341.v06Liste;

public class Knoten {
  public int Zahl;
  public Knoten Nf;    //Nachfolger

  public Knoten(int Zahl, Knoten Nf) {
    this.Zahl = Zahl;
    this.Nf = Nf;
  }
}
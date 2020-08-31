package de.hwglu.bwi351_1.v06Liste;

public class P1KnotenVerketten {
  public static void main(String[] args) {
    Knoten k1, k2;
 
    k1 = new Knoten(1, null);
    k2 = new Knoten(2, null);
    k1.Nf = k2;
    
// noch einen Konten davorhängen
    Knoten k0 = new Knoten(0, k1);

  }
}
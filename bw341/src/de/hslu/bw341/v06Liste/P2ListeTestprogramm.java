package de.hslu.bw341.v06Liste;

public class P2ListeTestprogramm {
  public static void main(String[] args) {
    Liste L = new Liste ();

// normales Einfügen:
    L.einfuegenAnfang(26);
    L.einfuegenAnfang(10);
    L.einfuegenEnde(17);
    L.einfuegenEnde(47);
    L.einfuegenAnfang(5);
    L.einfuegenEnde(15);


// sortiertes Einfügen: 
//  erst mal eine Liste aufbauen,
    Liste Ls = new Liste ();
    Ls.einfuegenAnfang(26);
    Ls.einfuegenAnfang(10);
    Ls.einfuegenAnfang(5);
//  dann einfügen...    
//  ... in der Mitte  
    Ls.einfuegenSortiert(17);
//  ... am Ende
    Ls.einfuegenSortiert(47);
//  ... am Anfang    
    Ls.einfuegenSortiert(3);

  }
}
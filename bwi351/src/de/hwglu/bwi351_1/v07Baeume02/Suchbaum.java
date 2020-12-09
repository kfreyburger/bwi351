package de.hwglu.bwi351_1.v07Baeume02;

public class Suchbaum {
  Knoten wurzel;

  public Suchbaum() {
    this.wurzel = null;
  }

 
  public void einfuegen(int wert) {
    Knoten neuesBlatt = new Knoten(wert, null, null);
    if (this.wurzel != null) {
      Knoten temp = this.wurzel;
      Knoten parent = null;
//suche einen freien Platz
      while (temp != null) {
        parent = temp;
        if ( neuesBlatt.wert > temp.wert )
          temp = temp.rechts;
        else   //wenn der Wert schon vorhanden wird links eingetragen
          temp = temp.links;
      }
//   neuen Knoten eintragen:
      if ( neuesBlatt.wert > parent.wert )
          parent.rechts = neuesBlatt;
        else
          parent.links = neuesBlatt;
   }
    else 
    	this.wurzel = neuesBlatt;
    
  }
  private Knoten sucheKnoten(int wert) {
    Knoten temp = this.wurzel;
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
    return (this.sucheKnoten(wert) != null);
  }

  private void printInorder (Knoten k) {
    if ( k != null ) {
    	this.printInorder(k.links);
      System.out.print(k);
      this.printInorder(k.rechts);
    }
  }
  public void printInorder() {
  	this.printInorder(this.wurzel);
    System.out.println();
  }
  private void printPreorder (Knoten k) {
    if ( k != null ) {
      System.out.print(k);
      this.printPreorder(k.links);
      this.printPreorder(k.rechts);
    }
  }
  public void printPreorder() {
  	this.printPreorder(this.wurzel);
    System.out.println();
  }
  private void printPostorder (Knoten k) {
    if ( k != null ) {
    	this.printPostorder(k.links);
    	this.printPostorder(k.rechts);
      System.out.print(k);
    }
  }
  public void printPostorder() {
  	this.printPostorder(this.wurzel);
    System.out.println();
  }
}
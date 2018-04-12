package de.hslu.bw341.v07Baeume01;

public class Binaerbaum {
  Knoten wurzel;

  public Binaerbaum() {
    Knoten d = new Knoten('D', null, null);
    Knoten e = new Knoten('E', null, null);
    Knoten b = new Knoten('B', d, e);
    Knoten f = new Knoten('F', null, null);
    Knoten g = new Knoten('G', null, null);
    Knoten c = new Knoten('C', f, g);
    this.wurzel = new Knoten('A', b, c);
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
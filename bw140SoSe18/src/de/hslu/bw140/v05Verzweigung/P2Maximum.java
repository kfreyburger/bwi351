package de.hslu.bw140.v05Verzweigung;

public class P2Maximum {
  public static void main(String[] args) {
    int a = 5, b = 2, c;

    if ( a > b )
      c = a;
    else 
      c = b;

    System.out.println("Das Maximum von "+a+" und "+b+" beträgt: "+c);
  }
}
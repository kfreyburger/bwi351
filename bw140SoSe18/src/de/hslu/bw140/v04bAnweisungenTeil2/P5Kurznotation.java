package de.hslu.bw140.v04bAnweisungenTeil2;

public class P5Kurznotation {
  public static void main(String[] args) {

  int a ,b;

  a = 3;
  a+=5;
  a++;
  
  a = b = 10;
  System.out.println("a = "+a+", b = "+b);
// Stringkonstanten mit " "
// Polymorphismus bei Strings: Kleben mit + 
// eine Zahl wird dazu zuerst in einen String umgewandelt

   
  a *= 3/2;
  b = b * 3 / 2;
  System.out.println("a *= 3/2 ergibt "+a);
  System.out.println("b = b * 3 / 2 ergibt "+b);

//  Postfix: erst Ausdruck, dann erhöht
  a = 1;
  System.out.println("a = "+a);
  b = 5 * a++;
  System.out.println("Postfix: a = "+a+", b = "+b);

//  Präfix: erst erhöht, dann Ausdruck
  a = 1;
  System.out.println("a = "+a);
  b = 5 * ++a;
  System.out.println("Präfix: a = "+a+", b = "+b);

//  Postfix und doppelte Verwendung
  a = 1;
  System.out.println("a = "+a);
  b = 5 * a++ * a;
  System.out.println("Postfix und doppelte Verwendung: a = "+a+", b = "+b);



  }
}
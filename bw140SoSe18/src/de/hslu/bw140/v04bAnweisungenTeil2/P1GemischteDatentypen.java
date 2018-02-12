package de.hslu.bw140.v04bAnweisungenTeil2;


public class P1GemischteDatentypen {
  public static void main(String[] args) {

  int i1 = 20, i2=8, i3;
  double d1 = 1.5, d2;
  i3 = i1 + i2;	   // Integer Rechnung
  d2 = i3 + d1;	   // Implizite Typanpassung: Umwandlung int nach double 

//    i3 = d2;       
// ergibt Fehler Type mismatch, cannot convert from double to int  

  i3 = (int) d2;   // Casting: Explizite Typconversion       
  
// 2. Beispiel Division:  
	d2 = i1 / i2;
	System.out.println(d2);
// durch Einführen einer Konstante, kann man Erzwingen, dass im Ausdruck
// korrekt gerechnet wird. 
	d2 = 1.0 * i1 / i2;
	System.out.println(d2);
  
    
// Feinheit: Ergebnis mindestens int 
  short s = 5;
//  s = s + s; // Fehler type mismatch 
  s = (short)(s+s);               



  }
}
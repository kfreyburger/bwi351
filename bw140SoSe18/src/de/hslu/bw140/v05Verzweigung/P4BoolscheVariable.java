package de.hslu.bw140.v05Verzweigung;



public class P4BoolscheVariable {
  public static void main(String[] args) {
    int x = 10;
// int x = -1 0 5 10

    boolean a = x > 0 && x <= 10;
    boolean b=x<5||x>9;
    boolean c = ! (b || a);

    System.out.println("x "+x+" a "+a);
    System.out.println(" b "+b);
    System.out.println(" c "+c);
  }
}
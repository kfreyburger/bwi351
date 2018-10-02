package de.hslu.bw341_1.v07Baeume02;

public class Testprogramm {
  public static void main(String[] args) {
    Suchbaum b = new Suchbaum();
    b.einfuegen(6);
    b.einfuegen(3);
    b.einfuegen(1);
    b.einfuegen(5);
    b.einfuegen(9);
    b.einfuegen(7);
    b.einfuegen(10);
    b.einfuegen(4);

    int suchkrit = 10;
    if (b.suche(suchkrit))
      System.out.println(suchkrit+" wurde gefunden");
    else
       System.out.println(suchkrit+" wurde nicht gefunden");

    System.out.println("Inorder Durchlauf:");
    b.printInorder();
    System.out.println("Preorder Durchlauf:");
    b.printPreorder();
    System.out.println("Postorder Durchlauf:");
    b.printPostorder();
  }
}
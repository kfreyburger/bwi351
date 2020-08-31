package de.hwglu.bwi351_1.v07Baeume01;

public class Testprogramm {
  public static void main(String[] args) {
   Binaerbaum b = new Binaerbaum();

   System.out.println("Inorder Durchlauf:");
   b.printInorder();
   System.out.println("Preorder Durchlauf:");
   b.printPreorder();
   System.out.println("Postorder Durchlauf:");
   b.printPostorder();

  }
}
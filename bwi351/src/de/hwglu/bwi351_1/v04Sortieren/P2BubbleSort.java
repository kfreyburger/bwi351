package de.hwglu.bwi351_1.v04Sortieren;

public class P2BubbleSort {
  public static void main(String[] args) {
    int[] folge = { 5, 3, 8, 9, 2, 1};

   System.out.println("Das Array zu Beginn: ");
    for (int i = 0; i < folge.length; i++)
      System.out.print(" " + folge[i]);
    System.out.println();

    for (int i= 0; i< folge.length - 1;i++){
       for (int j = 0; j < folge.length-1-i; j++) {
         if (folge[j+1] < folge[j]) {   //falsche Reihenfolge --> vertauschen
           int merke = folge[j];
           folge[j] = folge[j+1];
           folge[j+1] = merke;
         }
       }
    }
   System.out.println("Das Array am Ende: ");
   for (int i = 0; i < folge.length; i++)
      System.out.print(" " + folge[i]);

  }
}
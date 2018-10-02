package de.hslu.bw341_1.v04Sortieren;

public class P1Selection {
  public static void main(String[] args) {
   int[] folge = { 5, 1, 8, 3, 9, 2};

   System.out.println("Das Array zu Beginn: ");
    for (int i = 0; i < folge.length; i++)
      System.out.print(" " + folge[i]);
    System.out.println();

    int kleinstes, index;
    for (int i= 0; i< folge.length - 1;i++){
      kleinstes = folge[i];
      index = i;
      for (int j = i+1; j < folge.length; j++) {
         if (folge[j] < kleinstes) {
           kleinstes = folge[j];
           index = j;
         }
       }
       folge[index] = folge[i];
       folge[i] = kleinstes;

    }
   System.out.println("Das Array am Ende: ");
   for (int i = 0; i < folge.length; i++)
      System.out.print(" " + folge[i]);
  }
}
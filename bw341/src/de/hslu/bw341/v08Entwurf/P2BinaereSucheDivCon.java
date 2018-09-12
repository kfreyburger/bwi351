package de.hslu.bw341.v08Entwurf;

public class P2BinaereSucheDivCon {

   public static int BinaereSuche(int []folge,int Sucheig, int UntereGrenze,
                              int ObereGrenze) {
     int Mitte = ( UntereGrenze + ObereGrenze) / 2;
     if (folge[Mitte] == Sucheig)
        return Mitte;
     if (UntereGrenze >= ObereGrenze)      //nicht gefunden
	return -1;

     if (folge[Mitte] > Sucheig)  //unten weitersuchen
       return BinaereSuche(folge, Sucheig, UntereGrenze, Mitte - 1);
     else                         //oben weitersuchen
       return BinaereSuche(folge, Sucheig, Mitte + 1, ObereGrenze);
   }


  public static void main(String[] args) {
    int[] folge = { 0, 1, 2, 4, 5, 8, 9, 12, 13, 18};
    System.out.println(BinaereSuche(folge,8,0,folge.length-1));
  }



}
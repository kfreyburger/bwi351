package de.hslu.bw140.v05Verzweigung;

/**
 * Title:        Verzweigungen in der Vorlesung
 * Description:
 * Copyright:    Copyright (c) 2003
 * Company:
 * @author
 * @version 1.0
 */

public class P5SwitchExample {
  public static void main(String[] args) {
    int month = 15, tage = 0;

    switch (month) {
      case 1:
        tage = 31;
        break;
      case 2:
        tage = 28;
        break;
      case 3:
        tage = 31;
        break;
      case 4:
       tage = 30;
       break;
      case 5:
        tage = 31;
        break;
      case 6:
        tage = 30;
        break;
      case 7:
        tage = 31;
        break;
      case 8:
        tage = 31;
        break;
      case 9:
        tage = 30;
        break;
      case 10:
        tage = 31;
        break;
      case 11:
        tage = 30;
        break;
      case 12:
        tage = 31;
        break;
      default:
        System.out.println("Monat falsch");
    }
    System.out.println("Monat: "+month+" Tage: "+tage);

  }
}
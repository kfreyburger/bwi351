package v04bAnweisungenTeil2;


public class P3Character {
  public static void main(String[] args) {
  char ch1 = 'a';  // Zeichenkonstante mit einem '
  int i;
  char ch2;
  i = ch1 + 1;     //Implizite Typanpassung: char --> int   
  ch2 = (char) i;
  System.out.print(i);
  System.out.print(" ");
  System.out.println(ch2);

  }
}
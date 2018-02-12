package v04bAnweisungenTeil2;

public class P4StringUndAusgabe {
  public static void main(String[] args) {

  	System.out.println("Willkommen...");  //Stringkonstante mit " 
  	int a = 3;
  	System.out.println(a);

//  Polymorphismus: + bei Strings --> kleben 
// implizite Typanpassung int --> String  	
    System.out.println("Variable a = " + a);          
 
    System.out.println(1 + 2 + 3 + 4);    
    System.out.println(1 + 2 + 3 + "4");
    System.out.println("1" + 2 + 3 + 4);    
    System.out.println('1' + 2 + 3 + 4);
  }
}
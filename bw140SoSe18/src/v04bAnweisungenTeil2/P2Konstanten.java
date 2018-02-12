package v04bAnweisungenTeil2;

public class P2Konstanten {
	public static void main(String[] args) {

		// Ganzzahlige Konstanten:
  	int i = 20;     //Konstante vom Typ integer 
    long l =  3000000000L;   //Konstante vom Typ long
    i= 0x1000;        //Konstante wird Hexadezimal interpretiert
    i= 0x3AF;
    
    
    i= 020;        //Konstante wird Octal interpretiert
    
    
    // Floatingpoint-Konstanten      
    double d = 1.0;
    
//  Durch eine Floatingpoint-Konstante 
//  kann man eine double-Rechnung erzwingen:
  	d = 1.0 * 20 / 8;
		System.out.println(d);
		
// Float Konstanten kann man durch den Zusatz f deklarieren:
		float f = 1.0f * 20 / 8;
		System.out.println(f);
// oder aber Casting am Schluss
		f = (float) (1.0 * 20 / 8);
	}
}
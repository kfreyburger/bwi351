package de.hslu.bw140.v05Verzweigung;

public class P1ErstesBeispiel {
	public static void main(String[] args) {
    int x = 10;
		
		if (x > 8)
		   System.out.println("Die Variable x ist größer als 8");
		
		
		if (x > 11)
			System.out.println("Die Variable x ist größer als 11");
		else 
			System.out.println("Die Variable x ist nicht größer als 11");
		
		
		if (x > 8) {  // als Anweisungsblock formuliert     			
		   System.out.println("Die Variable x ist größer als 8");
		   System.out.println("Das ist der Hammer!");
		}
	}
}

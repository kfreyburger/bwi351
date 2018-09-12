package de.hslu.bw341.v05Rekursion;

public class P3Fibonacci {
  static long fib(long n) {
    if (n == 0 || n == 1)
      return n;
    else
      return fib(n-2)+ fib(n-1);
    }

// Fibonacci von n (iterativ)
  static long fibIterative(long n) {
//  in den Übungen
    return 1;
  }

  public static void main(String[] args) {
  	for (int i = 0; i <= 50; i++) {
   	 long timeBegin = System.currentTimeMillis();
   	 long wert = fib(i);
   	 long timeEnd = System.currentTimeMillis();
   	 System.out.println(i+" "+wert+ " "+(timeEnd-timeBegin));
 	}

 

  }
}
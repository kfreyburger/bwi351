package de.hslu.bw341.v02AlgKomplexitaet;

public class P1SchleifenMessen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long timeStart = System.currentTimeMillis();

		final long n = 1000;
		long count = 0;

		for (int i = 0; i < n; i++) 
 			for (int j = i; j < n; j++) 
//     		for (int k = 0; k < n; k++) 
					count++;

		
		long timeEnd = System.currentTimeMillis();

		System.out.println(count);
		System.out.println(timeEnd - timeStart);

	}

}

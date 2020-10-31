package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.print("[");
		
		for (int[]  a : matrise) {
			
			
			for(int b : a) {
				System.out.print(b + " ");
			}
			
		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String s = "";
		
		for (int[]a : matrise) {


			for(int b : a) {
				s += (b + " ");
				
			}
		s += "\n";
		
		}
		s += "";
		return s;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) { 
		int i;
		int j;
		
		int [][] skalert = new int [matrise.length][matrise[0].length];
			
		
		for(i = 0; i < skalert.length; i++) {
			skalert[i] = new int[matrise[i].length];
			for(j = 0; j < skalert.length; j++) {
				
				skalert[i][j] = matrise[i][j] * tall;
			}
		}
		
	return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int i;
		int j;
		
		boolean erLik = true;
		
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
			
			if (a[i][j] == b[i][j]) {
				return erLik;
		
				}
			}
		}
		return !erLik;
}	

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}

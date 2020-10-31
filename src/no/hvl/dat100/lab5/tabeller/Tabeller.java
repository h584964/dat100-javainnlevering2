
package no.hvl.dat100.lab5.tabeller;



public class Tabeller {
	
	

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");

		for (int tab: tabell) {
			System.out.print(tab + " ");
			
		}
		System.out.print("]");
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		int i;
		
		
		String s = ("[");
		
		for (i = 0; i < tabell.length; i++) {
		
			if (i != tabell.length - 1) {
				s += (tabell[i] + ",");
			}
			else {
				s += (tabell[i]);
			}
		
		}
		s+=("]");
		return s;
	}	
	
	// c)
	public static int summer(int[] tabell) {
		
		int sum= 0;
		
		
		
			
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
			}
		
		
		return sum;
	} 
	public static int summer2(int[] tabell2) {
		int sum = 0;
		int i;
	
	
		i= 0;
		while(i < tabell2.length){
		
		sum += tabell2[i];
		
		i++;	
	}
	
	return sum;
}
	
	public static int summer3(int[] tabell3) {
	int sum = 0;
	
	for(int i: tabell3){
		sum += i;	
	}
	return sum;
	}
	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnesTall = true;
		
		int i;
		i = 0;
		
		for (i = 0; i < tabell.length; i++) {
			
			if(tall == tabell[i]) {
				return finnesTall;
			}
			
		}
			
			return !finnesTall;	
	}
		
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i;
		
		for (i = 0  ; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
				
			}
			
		}
		
		
		return -1;
			
		

	}
	// f)
	public static int[] reverser(int[] tabell) {
		
		int nyTabell [] = new int [tabell.length];
		int j = tabell.length-1;
		int i = 0;
		
		for (i = 0; i < tabell.length; i++) {
			
			
			nyTabell[i] = tabell[j];  
			j--;
		}
		
	
		return nyTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i-1] > tabell[i]) {
				return false;
			}
			
			}
			
			return true;
		}
		
	

	// h)
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		
		int tabellLengde = tabell1.length + tabell2.length;
		int [] tabell = new int [tabellLengde];
		int i = 0;
		
		for (int e : tabell1) {
			tabell[i] = e;
			i++;
		}
		
		for (int e : tabell2) {
			tabell[i] = e;
			i++;
		}
		return tabell;
	}
	
	
			
}
		



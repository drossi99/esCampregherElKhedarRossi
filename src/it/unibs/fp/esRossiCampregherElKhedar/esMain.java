package it.unibs.fp.esRossiCampregherElKhedar;

import java.util.ArrayList;

public class esMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public int funzione(int n) {
		if (is)
	}
	
	public boolean isPrimo(int a) {
		int divisori=0;
		
		for (int i = 1; i < a; i++) {
		
			if (a%i==0) divisori++;
		}
		if(divisori >2) return false;
		return true;
	}
	
	public boolean isPotenza(int a) {
		ArrayList<Integer> listaPrimi = new ArrayList<Integer>();
		for (int i = 2; i < a; i++) {
			if (isPrimo(i)) listaPrimi.add(i);
		}
		
		for (int i = 0; i < listaPrimi.size(); i++) {
			double resto = a;
			do {
				resto = (double) resto / listaPrimi.get(i);
				
			} while (resto > 1);
			
			if (resto == 1) {
				
			}
		}
	}
}
package it.unibs.fp.pg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaccia {
	/**
	 * 
	 */
	private Scanner lettore = new Scanner(System.in);

	/**
	 * 
	 * @param msg
	 * @return
	 */
	public int letturaInt(String msg) {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			System.out.print(msg);
			try {
				valoreLetto = lettore.nextInt();
				finito = true;
			} catch (InputMismatchException e) {
				System.out.println("il valore inserito non � nel formato corretto");
				lettore.next();
			}
		} while (!finito);
		return valoreLetto;
	}

	/**
	 * 
	 * @param msg
	 */
	public void scriviR(String msg) {
		System.out.println(msg);
	}

	/**
	 * 
	 * @param msg
	 */
	public void scriviC(String msg) {
		System.out.print(msg);
	}
}

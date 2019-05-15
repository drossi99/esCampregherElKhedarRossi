package it.unibs.fp.esRossiCampregherElKhedar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaccia {
	private Scanner lettore = new Scanner(System.in);

	public int letturaInt(String msg) {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			System.out.print(msg);
			try {
				valoreLetto = lettore.nextInt();
				finito = true;
			} catch (InputMismatchException e) {
				System.out.println("il valore inserito non è nel formato corretto");
				lettore.next();
			}
		} while (!finito);
		return valoreLetto;
	}

	public int letturaInt() {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			try {
				valoreLetto = lettore.nextInt();
				finito = true;
			} catch (InputMismatchException e) {
				System.out.println("il valore inserito non è nel formato corretto");
				lettore.next();
			}
		} while (!finito);
		return valoreLetto;
	}

	public void scriviR(String msg) {
		System.out.println(msg);
	}

	public void scriviC(String msg) {
		System.out.print(msg);
	}
}

package javaproject;

import java.util.Scanner;

public class numeronegativoounao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if(numero < 0) {
			System.out.println("negativo");
		}
		if(numero >   0 ) {
			System.out.println("nao negativo");
		}
		if (numero == 0 ) {
			System.out.println("nao negativo");
		}

	}

}

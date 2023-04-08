package javaproject;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double numero = input.nextDouble();
		if(numero <0.0 || numero > 100.0) {
			System.out.println("fora de intervalo");
		}else if (numero <=25.0) {
			System.out.println("intervalo [0,25]");
		}else if (numero > 25 && numero <= 50.0) {
			System.out.println("intervalo (25,50]");
		}
	else if (numero <=25.0) {
		System.out.println("intervalo [0,25]");
	}
	else if (numero <=75.0) {
		System.out.println("intervalo [50,75]");
	}
	else {
		System.out.println("intervalo (75,100]");
	}

	}
}




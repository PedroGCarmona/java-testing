package javaproject;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double A;
        Double B;
        Double C;
        Double D;
        Double dif;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();

        dif = A * B - C * D;

        System.out.println("DIFERENCA = " + dif);

        sc.close();
    }
}
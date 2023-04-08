package javaproject;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, cod2,qte1;
		double qte2;
        double preco1, preco2;

       cod1 =  sc.nextInt();
       qte1 = sc.nextInt();
      preco1 = sc.nextDouble();
      
      cod2 = sc.nextInt();
      qte2 = sc.nextDouble();
      preco2 = sc.nextDouble();
 

        Double total = preco1*qte1 + preco2 * qte2;
        System.out.println();
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}

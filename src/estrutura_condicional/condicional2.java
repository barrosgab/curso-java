package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class condicional2 {

	// Fazer um programa para ler um número inteiro e dizer se este número é par ou
	// ímpar.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num;

		num = sc.nextInt();

		if ((num % 2) == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		sc.close();

	}

}

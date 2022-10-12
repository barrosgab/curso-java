import java.util.Locale;
import java.util.Scanner;

public class exercise5 {

	// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	// valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	// o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo1, qtdPecas1, codigo2, qtdPecas2;
		double valor1, valor2, total;

		codigo1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valor1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total = (qtdPecas1 * valor1 + qtdPecas2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}

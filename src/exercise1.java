import java.util.Locale;
import java.util.Scanner;

public class exercise1 {

	// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	// soma desses números com uma mensagem explicativa, conforme exemplos.

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numA, numB;
		
		numA = sc.nextInt();
		numB = sc.nextInt();
		
		System.out.printf("SOMA = %d", numA+numB);
		
		sc.close();

	}

}

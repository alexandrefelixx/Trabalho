import java.util.Scanner;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = 9;
		int a[][] = new int[n][n];
		int numeros;

		System.out.println("Numero da matriz: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean repetido;

				do {
					repetido = false;
					System.out.println("Informe um número: ");
					numeros = scanner.nextInt();

					for (int k = 0; k < n; k++) {
						for (int l = 0; l < n; l++) {
							if (a[k][l] == numeros) {
								repetido = true;
							}
						}
					}

					if (repetido) {
						System.out.println("Numero repetido, digite outro: ");

					}
				} while (repetido);

				a[i][j] = numeros;

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println ();
			for (int j = 0; j < n; j++) {
				System.out.println (" " + a[i][j]);
	}
}
	}
}

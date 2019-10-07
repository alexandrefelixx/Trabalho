import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 2;
		int gabarito[] = new int[13];
		int aposta[][] = new int[n][14];
		int acertos[] = new int[n];
		int resultado;
		int pontos;
		int i, j, numero;

		System.out.println("\n Valores para o gabarito ");
		System.out.println("Informe 13 valores: ");
		for (i = 0; i < 13; i++) {
			do {
				resultado = scanner.nextInt();
			} while (resultado < 1 || resultado > 3);
			gabarito[i] = resultado;
		}

		System.out.println("\n Valores que serão apostados ");
		for (i = 0; i < n; i++) {
			numero = i + 1;
			System.out.println("");
			System.out.println("Aposta número " + numero + ":");
			aposta[i][0] = numero;
			for (j = 1; j < 14; j++) {
				do {
					System.out.println("Informe o resultado de 13: " + j);
					resultado = scanner.nextInt();
				} while (resultado < 1 || resultado > 3);
				aposta[i][j] = resultado;
			}
		}

		for (i = 0; i < n; i++) {
			pontos = 0;
			for (j = 1; j < 14; j++) {
				if (aposta[i][j] == gabarito[j - 1]) {
					pontos++;
				}
			}
			acertos[i] = pontos;
		}

		System.out.println("\n Resultados das apostas: ");
		for (i = 0; i < n; i++) {
			System.out.print("Aposta número: " + aposta[i][0] + " Acertos: "
					+ acertos[i]);
			if (acertos[i] == 13) {
				System.out.print(" ganhador ");
			}
			System.out.print("\n ");
		}

	}

}

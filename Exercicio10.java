import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nome, endereço;

		int n1 = 2;
		int n2 = 5;
		String agenda[][] = new String[n1][n2];

		System.out.println("Numero da matriz: ");
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (j == 0) {
					System.out.println("Nome: ");
				} else if (j == 1) {
					System.out.println("Endereço: ");
				} else if (j == 2) {
					System.out.println("CEP: ");
				} else if (j == 3) {
					System.out.println("Bairro: ");
				} else {
					System.out.println("Numero: ");
				}

				agenda[i][j] = scanner.nextLine();

			}
		}
		System.out.println();

		for (int i = n1-1; i >= 0; i--) {
			System.out.println();

			for (int j = 0; j < n2; j++) {
				if (j == 0) {
					System.out.println("Nome: ");
				} else if (j == 1) {
					System.out.println("   ");
					System.out.println("Endereço: ");
				} else if (j==2) {
					System.out.println("   ");
					System.out.println("CEP: ");
				} else if (j==3) {
					System.out.println("   ");
					System.out.println("Bairro: ");
				} else {
					System.out.println("   ");
					System.out.println("Numero: ");
				}
				
				System.out.println (" " + agenda[i][j]);
				
			}

		}

	}

}

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n = 16;
		int v[] = new int[n];
		int matriz[][] = new int[4][4];
		int cont = 0;
		int i, j, aux;

		System.out.println("Informe 16 valores: ");
		for (i = 0; i < n; i++) {
			v[i] = ler.nextInt();

		}

		for (i = 1; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (v[i] < v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}

		for (int col = 0; col < matriz.length; col++) {
			for (int lin = 0; lin < matriz.length; lin++) {
				matriz[lin][col] = v[cont];
				cont++;
			}
		}

		for (int col = 0; col < matriz.length; col++) {
			System.out.println();
			for (int lin = 0; lin < matriz.length; lin++) {
				if (col == lin) {
					System.out.print(" ");
				} else {
					System.out.print(" " + matriz[col][lin]);

				}
			}

		}

	}

}

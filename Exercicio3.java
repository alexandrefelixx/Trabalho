
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = 10; 
		int v1[] = new int[n];
		int v2[] = new int[n]; 
		int v3[] = new int[n]; 
		int i; 
		
		System.out.println("\n Valores para V1: ");
		System.out.println("Informe 10 valores: ");
		for (i = 0; i < n; i++) {
			v1[i] = scanner.nextInt();
		}

		System.out.println("\n Valores para V2 ");
		System.out.println("Informe 10 valores: ");
		for (i = 0; i < n; i++) {
			v2[i] = scanner.nextInt();
		}

		for (i = 0; i < n; i++) {
			v3[i] = v1[i] * v2[i];
		}
		
		System.out.print("\n");
		for (i = 0; i < n; i++) {
			System.out.println("A multiplicacao de " + v1[i] + " por " + v2[i] + " é: " + v3[i]);
		}

	}

}

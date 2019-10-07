
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 100; 
		int vet[] = new int[n]; 
		int i, j, aux; 

		System.out.println("\n Valores para o Vetor ");
		System.out.println("Informe 100 valores: ");
		for (i = 0; i < n; i++) {
			vet[i] = scanner.nextInt();
		}
		
		for (i = 1; i < n; i++) {
		    for (j = 0; j < i; j++) {
		        if (vet[i] < vet[j]) {
		            aux = vet[i];
		            vet[i] = vet[j];
		            vet[j] = aux;
		        }
		    }
		}
		
		System.out.println("\n Valores em ordem crescente: ");
		for (i = 0; i < n; i++) {
	    	System.out.println(vet[i]);
	    }

		for (i = 1; i < n; i++) {
		    for (j = 0; j < i; j++) {
		        if (vet[i] > vet[j]) {
		            aux = vet[i];
		            vet[i] = vet[j];
		            vet[j] = aux;
		        }
		    }
		}
		
		System.out.println("\n Valores em ordem decrescente: ");
		for (i = 0; i < n; i++) {
	    	System.out.println(vet[i]);
	    }

	}

}

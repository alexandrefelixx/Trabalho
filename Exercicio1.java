import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = 20; 
		int v[] = new int[n]; 
		int i, p;
		int aux = 0; 
		
		
		System.out.println("Informe 20 valores: ");
		for (i = 0; i < n; i++) {
			v[i] = scanner.nextInt();
		}

		p = n;
		
		for (i = 0; i < n/2; i++) {	
			aux = v[i];
			v[i] = v[p-1];
			v[p-1] = aux;
			p--;
		}
		
		for (i = 0; i < n; i++) {
			System.out.println("Valor da posição " + (i+1) + " é :" + v[i]);
		}

	}

}

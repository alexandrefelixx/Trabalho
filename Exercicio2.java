
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = 10; 
		int x[] = new int[n]; 
		int y[] = new int[n]; 
		int z[] = new int[n*2]; 
		int i, j, p; 
		boolean igual; 

		p=1;
		
		System.out.println("Valores para X: ");
		System.out.println("Informe 10 valores: ");
		for (i = 0; i < n; i++) {
			x[i] = scanner.nextInt();
			p++;
		}
		
		System.out.println("\n Valores para Y: ");
		System.out.println("Informe 10 valores: ");
		for (i = 0; i < n; i++) {
			y[i] = scanner.nextInt();
			p++;
		}

		p=0;
		
		for (i = 0; i < n; i++) {
			igual = false;
			for (j = 0; j < n; j++) {
				if(x[i] == y[j]){
					igual = true;
				}
			}
			if(!igual){
				z[p] = x[i];
				System.out.println("Valor " + x[i] + " inserido em Z na posicao: " + p);
				p++;
			}
		}
		
		for (i = 0; i < n; i++) {
			igual = false;
			for (j = 0; j < n; j++) {
				if(y[i] == x[j]){
					igual = true;
				}
			}
			if(!igual){
				z[p] = y[i];
				System.out.println("Valor " + y[i] + " inserido em Z na posicao: " + p);
				p++;
			}
		}

	}

}
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int l = 3; 
		int c = 3; 
		int a[][] = new int[l][c];
		int b[][] = new int[l][c]; 
		int i, j, mult; 

		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		for (i = 0; i < l; i++) {
			for (j = 0; j < c; j++) {
				mult = a[i][j] * b[i][j];
				System.out.println(mult);
			}
		}
		
	}

}
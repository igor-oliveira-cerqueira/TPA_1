package aulaVetor.listaComplementar;

import java.util.Scanner;

public class RelacaoDivisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, n, j;
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Informe o número");
			a[i] = in.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			n = a[i];
			System.out.print("os divisores de "+n+" são [");
			for (j = 1; j <= n; j++) {
				if (n % j == 0) {
					System.out.print(" "+j);
				}
			}
			System.out.println(" ]");
		} 
		in.close();
	}
}

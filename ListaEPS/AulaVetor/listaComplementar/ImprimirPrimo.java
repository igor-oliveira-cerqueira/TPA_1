package aulaVetor.listaComplementar;

import java.util.Scanner;

public class ImprimirPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j, n, divisores = 0;
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Informe o número");
			a[i] = in.nextInt();
		} 
		
		for (i = 0; i < TAM; i++) {
			n = a[i];
			for (j = 1; j <= n; j++) {
				if (n % j == 0) {
					divisores ++;
				}
			}
			
			if (divisores == 2) {
                System.out.println(n + " é primo.");
            } else {
                System.out.println(n + " não é primo.");
            }
		}
		
		in.close();
	}
}

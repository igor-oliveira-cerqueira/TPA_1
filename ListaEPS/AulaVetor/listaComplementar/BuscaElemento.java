package aulaVetor.listaComplementar;

import java.util.Scanner;

public class BuscaElemento {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        final int TAM = 10;
	        int a[], i, x, achou;

	        a = new int[TAM];

	        for (i = 0; i < TAM; i++) {
	            a[i] = in.nextInt();
	        }

	        x = in.nextInt();

	        achou = 0;

	        for (i = 0; i < TAM; i++) {
	            if (a[i] == x) {
	                achou = 1;
	            }
	        }

	        if (achou == 1) {
	            System.out.println("O valor existe no vetor.");
	        } else {
	            System.out.println("O valor NAO existe no vetor.");
	        }

	        in.close();
	}
}

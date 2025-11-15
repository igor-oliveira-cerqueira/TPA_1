package aulaVetor.listaComplementar;

import java.util.Scanner;

public class FatorialVetor {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        final int TAM = 3;
	        int a[], b[], i, j;
	        a = new int[TAM];
	        b = new int[TAM];
	        for (i = 0; i < TAM; i++) {
	            a[i] = in.nextInt();
	        }

	        for (i = 0; i < TAM; i++) {
	            int fat = 1;

	            for (j = 1; j <= a[i]; j++) {
	                fat = fat * j; 
	            }

	            b[i] = fat;
	        }

	        for (i = 0; i < TAM; i++) {
	            System.out.println("B[" + i + "] = " + b[i]);
	        }
	        in.close();
	}
}

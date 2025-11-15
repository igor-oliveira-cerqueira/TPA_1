package aulaVetor.listaComplementar;

import java.util.Scanner;

public class TabuadaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int A[],i,j,r;
		A = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Informe o número:");
			A[i] = in.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			for (j = 1; j < 11; j++) {
				r = A[i]*j;
				System.out.println(A[i]+" x "+j+" = "+r);
			}
		}
	}

}

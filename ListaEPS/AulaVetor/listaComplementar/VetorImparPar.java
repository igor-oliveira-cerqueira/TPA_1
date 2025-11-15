package aulaVetor.listaComplementar;

import java.util.Scanner;

public class VetorImparPar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int A[],B[],i,par = 0,impar = TAM - 1;


        A = new int[TAM];
        B = new int[TAM];

       
        for (i = 0; i < TAM; i++) {
            System.out.print("Informe um número: ");
            A[i] = in.nextInt();
        }

       
        for (i = 0; i < TAM; i++) {
            if (A[i] % 2 == 0) {
                B[par] = A[i];
                par++;
            } else {
                B[impar] = A[i];
                impar--;
            }
        }

        System.out.println("\nVetor B (pares no início e ímpares no final):");
        for (i = 0; i < TAM; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

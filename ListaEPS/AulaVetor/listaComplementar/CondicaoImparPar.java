package aulaVetor.listaComplementar;

import java.util.Scanner;

public class CondicaoImparPar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int a[], b[], i;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1; 
            } else {
                b[i] = 0; 
            }
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }

        in.close();
	}
}

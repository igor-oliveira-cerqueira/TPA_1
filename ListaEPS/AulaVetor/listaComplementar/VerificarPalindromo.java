package aulaVetor.listaComplementar;

import java.util.Scanner;

public class VerificarPalindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int a[], i, j, pal;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
        	System.out.println("Informe os numeros:");
            a[i] = in.nextInt();
        }

        pal = 1; 

        j = TAM - 1;

        for (i = 0; i < TAM; i++) {
            if (a[i] != a[j]) {
                pal = 0; 
            }
            j = j - 1; 
        }


        if (pal == 1) {
            System.out.println("O vetor E palindromo.");
        } else {
            System.out.println("O vetor NAO e palindromo.");
        }

        in.close();
    }
}


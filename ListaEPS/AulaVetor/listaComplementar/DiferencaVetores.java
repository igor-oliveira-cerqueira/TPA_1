package aulaVetor.listaComplementar;

import java.util.Scanner;

public class DiferencaVetores {
	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        final int TAM = 10;

		        int a[], b[], c[];
		        int i, j, k;

		        a = new int[TAM];
		        b = new int[TAM];
		        c = new int[TAM]; 
		        k = 0;

		       
		        for (i = 0; i < TAM; i++) {
		        	System.out.println("Informe os números de A:");
		            a[i] = in.nextInt();
		        }

		      
		        for (i = 0; i < TAM; i++) {
		        	System.out.println("Informe os números de B:");
		            b[i] = in.nextInt();
		        }

		   
		        for (i = 0; i < TAM; i++) {
		            int existe = 0;

		         
		            for (j = 0; j < TAM; j++) {
		                if (a[i] == b[j]) {
		                    existe = 1; 
		                }
		            }

		            if (existe == 0) {
		                c[k] = a[i];
		                k++;
		            }
		        }

		        System.out.println("Vetor C (A - B):");
		        for (i = 0; i < k; i++) {
		            System.out.println("C[" + i + "] = " + c[i]);
		        }

		        in.close();
	}
}

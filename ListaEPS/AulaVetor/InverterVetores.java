package aulaVetor;

import java.util.Scanner;

public class InverterVetores {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i, j;
		j = TAM - 1;
		a = new int [TAM];
		b = new int [TAM];
		
		//Lendo os valores de A
		for (i=0; i<TAM; i++) {
			
			System.out.println("Informe o "+(i+1)+"° valor do vetor A:");
			a[i] = in.nextInt();
			
			b[j] = a[i];
			j = j - 1;
		}
	
		
		//laço para apresentar b
		System.out.print("B = [ ");
		for (j = 0; j<TAM; j++) {
			System.out.print(b[j]+" ");
			}
		System.out.print("]");
	}
}

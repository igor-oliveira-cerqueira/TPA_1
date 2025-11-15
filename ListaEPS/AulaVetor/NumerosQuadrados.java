package aulaVetor;

import java.util.Scanner;

public class NumerosQuadrados {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[], b[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		//laço para leitura do vetor A e calculo do vetor B
		for (i = 0; i<TAM; i++) {
			
			System.out.println("Informe o "+(i+1)+"° valor do vetor");
			a[i] = in.nextInt();
			
			b[i] = a[i]*a[i];
		}
		
		//laço para apresentar b
		System.out.print("B = [ ");
		for (i = 0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");

		in.close();
	}

}

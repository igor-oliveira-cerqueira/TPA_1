package aulaVetor;

import java.util.Scanner;

public class SomaNumeros {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//Lendo os valores de A
		for (i=0; i<TAM; i++) {
			System.out.println("Informe o "+(i+1)+"° valor do vetor A:");
			a[i] = in.nextInt();
		}
		
		//Lendo os valores de B
		for (i=0; i<TAM; i++) {
			System.out.println("Informe o "+(i+1)+"° valor do vetor B:");
			b[i] = in.nextInt();
			
		//Caculando os valores de C
			c[i] = a[i] + b[i];
		}
		
		//Apresentando os valores de C
		System.out.print("C = [ ");
		for (i = 0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}
}

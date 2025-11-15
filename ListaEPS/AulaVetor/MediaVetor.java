package aulaVetor;

import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[], i, media, soma = 0;
		final int TAM = 10;
		a = new int [TAM];
		
		//Lendo os valores de A
		for (i=0; i<TAM; i++) {
			System.out.println("Informe o "+(i+1)+"° valor do vetor A:");
			a[i] = in.nextInt();
			soma = a[i] + soma;
		}
		
		media = soma/TAM;
		
		System.out.println("A média é: "+media);
	}

}

package ativAula03;

import java.util.Scanner;

public class CalculoPrestacao {
	public static void main ( String args []) {
		
		Scanner ler= new Scanner ( System.in);
		
		double valor, taxa, tempo, prestacao;
		
		System.out.println ("Escreva o valor inicial da prestação:");
		valor= ler.nextDouble ();
		
		System.out.println ("Escreva a taxa que aumenta a cada dia:");
		taxa= ler.nextDouble ();
		
		System.out.println ("Escreva o tempo em dias do atraso:");
		tempo= ler.nextDouble ();
		
		prestacao = (valor+(valor*(taxa/100)*tempo));
		
		System.out.println ("A sua prestação atual é: " + prestacao);
		}
}

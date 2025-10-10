package ativAula03;

import java.util.Scanner;

public class CalculoSalario {
	public static void main ( String args []) {
		
		Scanner ler= new Scanner ( System.in);
		int quantAula, horaAula;
		double salario, inss, desconto;
		
		System.out.println ("Escreva a quantidade de Aulas dadas:");
		quantAula= ler.nextInt();
		
		System.out.println ("Escreva a quantidade ganha de Horas por Aula:");
		horaAula= ler.nextInt();
		
		System.out.println ("Escreva o desconto percentual do Inss:");
		desconto= ler.nextDouble ();
		
		inss = (quantAula*horaAula)*(desconto/100);
		
		salario = (quantAula*horaAula) - inss;
		
		System.out.println ("Seu salário líquido é: " + salario);
		}
}

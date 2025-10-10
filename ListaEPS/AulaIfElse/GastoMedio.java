package ativAula04;

import java.util.Scanner;

public class GastoMedio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double km, l, gastoMed;
		
		System.out.println("Informe os quilometros percorrido: ");
		km = in.nextDouble();
		
		System.out.println("Informe a capacidade de litros do tanque: ");
		l = in.nextDouble();
		gastoMed = km/l;
		
		if (gastoMed >= 10) {
			System.out.println("Econômico");
		} else {
			System.out.println("Não Econômico");
		}
	}
}

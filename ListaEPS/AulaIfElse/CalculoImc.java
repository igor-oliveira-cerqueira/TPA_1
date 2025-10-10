package ativAula04;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double kg, m, imc;
		
		System.out.println("Informe o seu peso:");
		kg = in.nextDouble();
		
		System.out.println("Informe sua altura:");
		m = in.nextDouble();
		
		imc = kg/(m*m);
		if (imc<18.5) {
			System.out.println("Excesso de Magreza");
		} else if (imc>=18.5 && imc<25) {
			System.out.println("Peso Normal");
		} else if (imc>=25 && imc<30) {
			System.out.println("Excesso de Peso");
		} else if (imc>=30 && imc<35) {
			System.out.println("Obesidade (Grau I)");
		} else if (imc>=35 && imc<40) {
			System.out.println("Obesidade (Grau II)");
		} else {
			System.out.println("Obesidade (Grau III)");
		}
	}
}

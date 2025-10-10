package aulaSwitchCase;

import java.util.Scanner;

public class TerminoMes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dia;
		System.out.println("Informe o mês de 1 a 12");
		dia = in.nextInt();
		
		switch (dia) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("O mês termina com 31");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("O mês termina com 30");
			break;
		case 2:
			System.out.println("O mês termina com 28");
			break;
		default:
			System.out.println("Inválido");
			
		in.close();
		}
	}
}

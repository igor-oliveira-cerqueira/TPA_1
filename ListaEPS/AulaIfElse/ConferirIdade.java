package ativAula04;
import java.util.*;
public class ConferirIdade {
	public static void main(String[] args) {
		int anoNasc, anoAtual, idade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o ano que você nasceu:");
		anoNasc = in.nextInt();
		
		System.out.println("Informe o ano atual:");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		
		if (idade>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}

package prjAula02;
import java.util.Scanner;
public class Somar {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int valor1,valor2,soma;
		
		System.out.println("-----------------------------");
		System.out.println("| SOU O GÊNIO DO ALGORITIMO |");
		System.out.println("-----------------------------");
		System.out.println("Vou fazer uma soma");
		System.out.println("Informe o 1° valor:");
		valor1 = ler.nextInt();
		System.out.println("Informe o 2° valor:");
		valor2 = ler.nextInt();
		soma = valor1 + valor2;
		System.out.println("Sua soma é: "+soma);
	}
}

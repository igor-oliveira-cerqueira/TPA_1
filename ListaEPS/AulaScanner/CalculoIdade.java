package prjAula02;
import java.util.Scanner;
public class CalculoIdade {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anoAtual,anoNascimento,idade;
		
		System.out.println("Bem vindo ao cálculo de Idade");
		System.out.println("Informe o Ano Atual:");
		anoAtual = ler.nextInt();
		System.out.println("Informe o seu ano de Nascimento:");
		anoNascimento = ler.nextInt();
		idade = anoAtual-anoNascimento;
		System.out.println("A sua idade é: "+idade);
	}
}

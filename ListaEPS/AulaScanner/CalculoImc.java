package prjAula02;
import java.util.Scanner;
public class CalculoImc {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.println("-----------------------------");
		System.out.println("| SOU O GÊNIO DO ALGORITIMO |");
		System.out.println("-----------------------------");
		System.out.println("Vou calcular seu IMC");
		System.out.println("Informe sua altura: ");
		altura = ler.nextDouble();
		System.out.println("Informe seu peso: ");
		peso = ler.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC: "+imc);
	}
}

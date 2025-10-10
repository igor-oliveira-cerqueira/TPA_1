package prjAula02;
import java.util.Scanner;
public class CalculoDias {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int dias,mes,anos;
		
		System.out.println("-----------------------------");
		System.out.println("| SOU O GÊNIO DO ALGORITIMO |");
		System.out.println("-----------------------------");
		System.out.println("Vou calcular os dias");
		System.out.println("Informe os dias: ");
		dias = ler.nextInt();
		mes = dias/30;
		anos = mes/12;
		System.out.println("Meses: "+mes);
		System.out.println("Anos: "+anos);
	}

}

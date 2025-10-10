package prjAula02;
import java.util.Scanner;
public class CalculoDias {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int dias,mes,anos;

		System.out.println("Vamos calcular o mes e o ano pelos dias");
		System.out.println("Informe os dias: ");
		dias = ler.nextInt();
		mes = dias/30;
		anos = mes/12;
		System.out.println("Meses: "+mes);
		System.out.println("Anos: "+anos);
	}

}


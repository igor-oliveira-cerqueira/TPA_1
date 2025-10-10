package prjAula02;
import java.util.Scanner;
public class VoumeLata {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double pi,r,v,h;

		System.out.println("Vamos calcular o volume de uma lata");
		System.out.println("Informe a altura: ");
		h = ler.nextDouble();
		System.out.println("Informe o raio: ");
		r = ler.nextDouble();
		pi = 3.14;
		v = pi*r*r*h;
		System.out.println("Seu Volume: "+v);
	}
}


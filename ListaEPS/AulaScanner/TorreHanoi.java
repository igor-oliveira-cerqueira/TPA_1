package prjAula02;
import java.util.Scanner;
public class TorreHanoi {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Vou embaralhar suas informações");
		System.out.println("Informe o valor de A: ");
		a = ler.nextInt();
		System.out.println("Informe o valor de B:");
		b = ler.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Valor de A: "+a);
		System.out.println("Valor de B: "+b);
	}
}


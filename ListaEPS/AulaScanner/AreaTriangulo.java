package prjAula02;
import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String args[]) {
		double altura,base,area;
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Bem vindo ao cálculo de Área do triangulo");
		System.out.println("Informe a Altura:");
		altura = ler.nextDouble();
		System.out.println("Informe a Base:");
		base = ler.nextDouble();
		area = (base*altura)/2;
		System.out.println("A Área é: "+area);
		}
}

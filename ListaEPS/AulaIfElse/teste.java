package ativAula04;
import java.util.*;
public class teste {
	public static void main(String[] args) {
		double kgPeixe, valorPeixe;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o peso do peixe:");
		kgPeixe = in.nextDouble();
		
		if (kgPeixe<=3) {
			valorPeixe = kgPeixe*25;
			System.out.println("Seu peixe custa: R$"+valorPeixe);
		} else if (kgPeixe>3 && kgPeixe<=5) {
			valorPeixe = kgPeixe*24;
			System.out.println("Seu peixe custa: R$"+valorPeixe);
		} else if (kgPeixe>5 && kgPeixe<=10) {
			valorPeixe = kgPeixe*23;
			System.out.println("Seu peixe custa: R$"+valorPeixe);
		} else {
			valorPeixe = 30 + (kgPeixe*20);
			System.out.println("Seu peixe custa: R$"+valorPeixe);
		}
		in.close();
	}
}
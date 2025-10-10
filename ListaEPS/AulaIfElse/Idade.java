package ativAula04;
import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a idade:");
		idade = in.nextInt();
		
		if (idade<10) {
			System.out.println("criança");
		} else if (idade>=10 && idade<18) {
			System.out.println("adolescente");
		} else if (idade>=18 && idade<60) {
			System.out.println("adulto");
		} else {
			System.out.println("idoso");
		} 
	}
}

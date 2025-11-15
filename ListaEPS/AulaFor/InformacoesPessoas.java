package aulaFor;

import java.util.Scanner;

public class InformacoesPessoas {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int velha = 0, idoso = 0, nova = 0,contJovem = 0,i,idade;
		double kg,altura,medAltura = 0,menorPeso = 0;
		//somar a altura dos jovens,contar os jovens com contJovem e dividir a soma pelos jovens;
		for (i=1; i<=25; i++) {
			System.out.println("---------------------------");
			System.out.println("       "+i+"° pessoa");
			System.out.println("Informe a idade:");
			idade = in.nextInt();
			System.out.println("Informe a altura:");
			altura = in.nextDouble();
			System.out.println("Informe o peso:");
			kg = in.nextDouble();
			
			if (idade > 50) {
				idoso++;
			}
			
			if (idade >= 10 && idade <= 20) {
				contJovem++;
				medAltura = medAltura + altura;
			}
			
			if (kg < 40) {
				menorPeso++;
			}
			
			if (idade > velha) {
				velha = idade;
			}
			
			if (idade < nova); {
				nova = idade;
			}
		}
		
		medAltura = medAltura/contJovem;
		menorPeso = (menorPeso*100)/25;
		System.out.println("Pessoas com +50 anos: "+idoso);
		System.out.printf("Média das pessoas entre 10 e 20 anos: %.2f\n", medAltura);//aqui no printf se usa a virgula;
		System.out.printf("Porcentagem das pessoas de peso inferior a quarenta: %.1f%%\n", menorPeso);// dois %% no printf imprime uma "%";
		System.out.println("A pessoa mais velha tem: "+velha+" anos, e a pessoa mais nova tem: "+nova+" anos");
		
		in.close();
	}
}

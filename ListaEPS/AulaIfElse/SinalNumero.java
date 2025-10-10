package ativAula04;
import java.util.*;
public class SinalNumero {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numInt;
		
		System.out.println("informe um número inteiro:");
		numInt = in.nextInt();
		if (numInt>0) {
			System.out.println("positivo");
		} else if (numInt<0) {
			System.out.println("negativo");
		} else {
			System.out.println("neutro");
		}
	}
}

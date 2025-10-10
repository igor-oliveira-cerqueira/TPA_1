package ativAula04;
import java.util.*;
public class ImparOuPar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Informe um número inteiro:");
		n = in.nextInt();
		if (n%2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
}

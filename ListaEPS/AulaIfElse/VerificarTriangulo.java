package ativAula04;

import java.util.Scanner;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Informe o lado A:");
		a = in.nextDouble();
		
		System.out.println("Informe o lado B:");
		b = in.nextDouble();
		
		System.out.println("Informe o lado C:");
		c = in.nextDouble();
		
		if (a<(b+c) || b<(a+c) || c<(a+b)) {
			if (a == b && a == c) {
				System.out.println("Equilátero");
			} else if (a != b && a != c && c != b) {
				System.out.println("Escaleno");
			} else {
				System.out.println("Isósceles");
			}
		} else {
			System.out.println("Triangulo inválido");
		}
	}
}

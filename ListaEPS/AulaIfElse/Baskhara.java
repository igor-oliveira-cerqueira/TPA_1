package ativAula04;

import java.util.Scanner;

public class Baskhara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1, x2, a, b, c, delta;
		
		System.out.println("Informe o valor de A:");
		a = in.nextDouble();
		
		System.out.println("Informe o valor de B:");
		b = in.nextDouble();
		
		System.out.println("informe o valor de C:");
		c = in.nextDouble();
		
		delta = (b*b) - 4*a*c;
		if (delta<0) {
			System.out.println("Não há raizes");
		} else if (delta == 0) {
			x1 = -b/(2*a);
			System.out.println("X: "+x1);
		} else {
			x1 = ((-b) + Math.sqrt(delta))/(2*a);
			x2 = ((-b) - Math.sqrt(delta))/(2*a);
			System.out.println("X1: "+x1);
			System.out.println("X2: "+x2);
		}
	}
}

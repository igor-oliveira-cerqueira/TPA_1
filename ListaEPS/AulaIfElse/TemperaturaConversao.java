package ativAula04;
import java.util.*;
public class TemperaturaConversao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.println("Informe a temperatura em Fahrenhein:");
		f = in.nextDouble();
		c = (f-32)/1.8;
		
		if (c<0) {
			System.out.println("Frio extremo");
		} else if (c<11) {
			System.out.println("Frio");
		} else if (c<21) {
			System.out.println("Frio moderado");
		} else if (c<25) {
			System.out.println("Clima ameno");
		} else {
			System.out.println("Calor");
		}
	}
}

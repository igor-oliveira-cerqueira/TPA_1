
public class CalculoImc {
	public static void main(String args[]) {
		double imc,peso,altura;
		
		peso = 70.0;
		altura = 1.60;
		imc = peso/(altura*altura);
		
		System.out.println("Seu IMC é: " + imc);
	}
}


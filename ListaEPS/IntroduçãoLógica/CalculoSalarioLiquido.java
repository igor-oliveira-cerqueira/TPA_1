
public class CalculoSalarioLiquido {
	public static void main(String args[]) {
		double salario,inss,valeTransp,salarioLiq;
		
		salario = 1460;
		inss = salario*0.08;
		valeTransp = salario*0.06;
		salarioLiq = salario-(valeTransp+inss);
		
		System.out.println("Seu salário liquido é: " + salarioLiq);
	}
}

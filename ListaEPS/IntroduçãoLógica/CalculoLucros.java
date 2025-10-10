
public class CalculoLucros {
	public static void main(String args[]) {
		double preco,quantVenda,lucro,precoVenda;
		
		preco = 3;
		precoVenda = 5;
		quantVenda = 77;
		lucro = (precoVenda-preco)*quantVenda;
		
		System.out.println("Seus lucros foram " + lucro);
	}
}

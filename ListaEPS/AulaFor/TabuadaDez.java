package aulaFor;

public class TabuadaDez {
	public static void main(String[] args) {
		int j,i,x;
		for (i = 1;i <= 10;i++) {
			for (j = 1; j<=10; j++) {
				x = i * j;
				System.out.println(i+" x "+j+" = "+x);
			}
		}
	}
}

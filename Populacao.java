import java.util.Scanner;
public class Populacao{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		int pA, pB, casos, ano = 0;
		double g1, g2;

		casos = teclado.nextInt();

		for ( int i = 0; i < casos; i ++){

			pA = teclado.nextInt();
			pB = teclado.nextInt();
			g1 = teclado.nextDouble();
			g2 = teclado.nextDouble();

			while (cidA <= cidB || ano <= 100){

				cidA += cidA * (taxa1 / 100);
				cidB += cidB * (taxa2 / 100);

				ano ++;
			}
			if (ano > 100)
				System.out.println("Mais de 1 seculo.");
			else
				System.out.println(ano + " anos.");
		}
	}
}
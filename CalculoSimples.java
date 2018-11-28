import java.util.Scanner;

public class CalculoSimples{

	public static void main (String [] args){

		Scanner teclado = new Scanner (System.in);

		int cod1, cod2,quant1, quant2;
		Double prec1, prec2;

		cod1 = teclado.nextInt();
		quant1 = teclado.nextInt();
		prec1 = teclado.nextDouble();

		cod2 = teclado.nextInt();
		quant2 = teclado.nextInt();
		prec2= teclado.nextDouble();

		Double soma = quant1 * prec1 + quant2 * prec2;

		System.out.printf("VALOR A PAGAR: R$ %.2", soma);
	}
}

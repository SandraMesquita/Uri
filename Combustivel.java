import java.util.Scanner;
public class Combustivel{

	public static void main(String[]args){

		Scanner teclado = new Scanner( System.in);
		// a é o tempo e b a velocidade media

		double a, b, res;

		a = teclado.nextDouble();
		b = teclado.nextDouble();

		res = (a * b) / 12;

		System.out.printf(" %.3f\n", res);

	}
}
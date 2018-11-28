import java.util.Scanner;
public class Distancia{
	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);
		// as variavei representam os pontos p1 e p2 no plao cartesiano para fazer o calculo.
		double x1, y1, x2, y2, res;

		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();

		res = Math.sqrt( ((x2 - x1) * ( x2 - x1)) + ((y2 - y1) * (y2 - y1)) );

		System.out.printf("%.4f\n", res);

	}
}
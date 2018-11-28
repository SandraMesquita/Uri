import java.util.Scanner;
public class Medis{

	public static void main(String[]args){

		Scanner teclado =  new Scanner (System.in);

		int numVez, cont = 0;
		double num1, num2, num3, media;

		numVez = teclado.nextInt();

		while (cont < numVez){

			num1 = teclado.nextDouble();
			num2 = teclado.nextDouble();
			num3 = teclado.nextDouble();

			media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);
			cont ++;

			System.out.printf("%.1f", media);
		}

	}
}
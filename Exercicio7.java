import java.util.Scanner;
public class Exercicio7{

	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);

		double [] numerosA = new double [10];
		double [] numerosB = new double [10];

		System.out.println("Por gentileza digite 10 numeros:");

		for (int i = 0; i < 10; i ++){
			numerosA[i] = teclado.nextDouble();
		}

		for (int i = 0; i < 10; i++){

			numerosB[i] = numerosA[i] + i;
		}

		for (int i = 0; i < 10; i++){

			System.out.printf("B[%d] = %.1f\n", i, numerosB[i]);
		}

	}
}
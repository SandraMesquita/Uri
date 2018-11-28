import java.util.Scanner;
public class Exercicio5{

	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);

		int casos, pares, impares, num;
		int [][] somas = new int [2][2];

		System.out.println("Por gentileza digite o total de numeros a serem 
							analisados:");

		//casos significa o total dos numeros;
		casos = teclado.nextInt();
		pares = 0;
		impares = 0;

		System.out.println("Digite os numeros para serem analisados:");

		// o i significa o indice sendo analisado
		for (int i = 0; i < casos; i++){

			num = teclado.nextInt();

			if( num % 2 == 0){
				pares += num;
			}
			else{
				impares += num;
			}
		}

		somas [0][0] = pares;
		somas [0][1] = impares;

		System.out.println("A Soma dos numeros Pares eh " + somas [0][0] + ";");
		System.out.println("E a Soma dos numeros Impares eh " + somas [0][1] + 
							".");
	}
}
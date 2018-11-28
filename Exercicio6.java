import java.util.Scanner;
public class Exercicio6{

	public static void main(String [] args){
		Scanner teclado = new Scanner (System.in);

		int aux;
		int [] numeros = new int [10];

		System.out.println("Por gentileza digite 10 numeros inteiros:");

		// o i significa o indice sendo analisado
		for(int i = 0; i < numeros.length; i ++){
			numeros[i] = teclado.nextInt();
		}

		// o i significa o indice sendo analisado
		for (int i = 0; i < numeros.length / 2; i++){

			aux = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = aux;
		}

		System.out.println("Os numeros digitados Invertidos ficam dessa forma:");

		// o i significa o indice sendo analisado
		for (int i = 0; i < numeros.length; i++){
			System.out.printf("%d ",numeros[i]);
		}

		System.out.println("");
	}
}
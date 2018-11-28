import java.util.Scanner;
public class Vetor{

	public static void main (String [] args){

		Scanner teclado =new Scanner(System.in);
		int [] vetorNum = new int [5];
		int soma = 0, maior, menor;
		float media;

		System.out.println("Por favor, digite 5 valores inteiros:");

		for (int i = 0; i < vetorNum.length; i ++){
			 vetorNum [i] = teclado.nextInt();
			 soma += vetorNum[i];
		}
		media = (float) soma / vetorNum.length;
		maior = vetorNum[0];
		menor = vetorNum[0];

		for (int i = 0; i < vetorNum.length; i ++){
			if (vetorNum[i] < menor)
				menor = vetorNum[i];

			if (vetorNum[i] > vetorNum.length)
				maior = vetorNum[i];
		}
		System.out.printf("A media dos valores e %.2f.\n", media);
		System.out.printf("O menor valor e %d.\n", menor);
		System.out.printf("O maior valor e %d.\n", maior);
	}
}
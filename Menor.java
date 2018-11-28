import java.util.Scanner;
public class Menor{

	public static void main (String [] args){
		Scanner teclado =new Scanner (System.in);

		int casos, menor, indice = 0;

		casos = teclado.nextInt();

		int [] vetor = new int [casos];

		for (int i = 0; i < casos; i ++){
			vetor [i] = teclado.nextInt();
		}
		menor = vetor [0];

		for (int i = 0; i < casos; i++){
			if (menor > vetor [i]){
				menor = vetor [i];
				indice = i;
			}
		}

		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Posicao: %d\n", indice);

	}
}
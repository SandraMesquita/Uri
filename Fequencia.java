import java.util.Scanner;
public class Fequencia{

	public static void main (String [] args){
		Scanner teclado = new Scanner (System.in);

		int casos, x;
		int [] vetor = new int [2001];

		casos = teclado.nextInt();

		for (int i = 0; i < casos; i++){
			x = teclado.nextInt();
			vetor[x] ++;
		}
		for ( int i = 0; i < vetor.length; i++){
			if (vetor[i] != 0){
				System.out.println(i + " aparece " + vetor[i] + " vez(es)");
			}
		}
	}
}
import java.util.Scanner;
public class Selecao{

	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);

		double [] vetor = new double [100];	

		for (int i = 0; i < vetor.length; i++){
			vetor[i] = teclado.nextDouble();
		}
		for (int i = 0; i < vetor.length; i++){
			if (vetor[i] <= 10){
				System.out.println("A[" + i + "] = " + vetor[i]);
			}
		}
	}
}
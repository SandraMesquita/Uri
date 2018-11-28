import java.util.Scanner;
public class PreencheDiv{

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);

		double x;
		double [] vetor = new double [100];

		x = teclado.nextDouble();
		vetor[0]= x;
		System.out.printf("N[0] = %.4f\n", x);
		for (int i = 1; i < vetor.length; i ++){
			vetor[i] = vetor[i - 1] / 2;
			System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
		}
	}
}
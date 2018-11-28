import java.util.Scanner;
public class Preenche{

	public static void main (String[]args){
		Scanner teclado = new Scanner(System.in);

		int x, num = 0;
		int [] vetor = new int [1000];

		x = teclado.nextInt();

		for (int i = 0; i < vetor.length; i ++){
			if(num < x){
				vetor[i] = num;
				System.out.println("N[" + i + "] = " + vetor[i]);
				num ++;
			}
			if (num == x)
				num = 0;
		}
	}
}
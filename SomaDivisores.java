import java.util.Scanner;
public class SomaDivisores{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int casos, num, soma = 0, divisores = 1, contcasos = 0;

		casos = teclado.nextInt();

		while (contcasos < casos){
			contcasos ++;
			num = teclado.nextInt();

			while (divisores < num){
				if (num % divisores == 0){
					soma += divisores;
					divisores ++;
				}
				else
					divisores ++;
			}
			if (soma == num)
				System.out.println(num + " eh perfeito");
			else
				System.out.println(num + " nao eh perfeito");
		}
	}
}
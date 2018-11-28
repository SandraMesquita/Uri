import java.util.Scanner;
public class Impares{

	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		int n, x, y, soma, cont, cont2, num;

		n = teclado.nextInt();
		soma = 0;
		cont = 0;
		cont2 = 0;

		while ( cont < n){
			cont ++;

			x = teclado.nextInt();
			y = teclado.nextInt();
			num = x;

			while ( cont2 < y){
				cont2 ++;

					if (num % 2 == 0)
						num ++;

				
				soma += num + 2;

				num += 2;
			}
			System.out.println(soma);
		}
	}
}System.out.println(soma);
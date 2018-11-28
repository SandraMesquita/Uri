import java.util.Scanner;
public class Quadrado {

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int linhas, contlinhas = 0, cont = 0, quad, cub;

		linhas = teclado.nextInt();

		while (contlinhas < linhas){
			contlinhas ++;

			cont ++;
			quad = cont * cont;
			cub = cont * cont * cont;

			System.out.printf("%d %d %d\n", cont, quad, cub);

		}
	}
}
import java.util.Scanner;
public class Pum{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		int linha, contlinha = 0, cont = 0;

		linha = teclado.nextInt();

		while (contlinha < linha){
			contlinha ++;
			cont ++;
			while (cont % 4 != 0){
				
					System.out.printf("%d ",cont);
					cont ++;
				if(cont % 4 == 0)
					System.out.println("PUM");

				
			}
		}
	}
}
import java.util.Scanner;
public class Resto2{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int div, cont = 1;

		div = teclado.nextInt();

		while(cont < 10000)
		{
			if (cont % div == 2)
			{
				System.out.println(cont);
				cont++;
			}
			else
				cont++;
		}

	}
}
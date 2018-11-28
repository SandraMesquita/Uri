import java.util.Scanner;
public class Crescente{

	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		int x, y;

		x = teclado.nextInt();
		y = teclado.nextInt();

		while (x != y)
		{
			if(x < y)
			{
				System.out.println("Crescente");
				x = teclado.nextInt();
				y = teclado.nextInt();
			}
			else
			{
				System.out.println("Decrescente");
				x = teclado.nextInt();
				y = teclado.nextInt();
			}
		}
	}
}
import java.util.Scanner;
public class Maior{
	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int a, b, c;

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		if (a > b  && a > c)
			System.out.println(a + " eh o maior");
		else if (b > a && b > c)
			System.out.println(b + " eh o maior");
		else if (c > a && c > b)
			System.out.println(c + " eh o maior");
	}
}
import java.util.Scanner;
public class Sort{

	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		int a, b, c;

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		if (a < b && b < c)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", a, b, c, a, b, c);
		else if(a < c && c < b)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", a, c, b, a, b, c);
		else if(b < a && a < c)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", b, a, c, a, b, c);
		else if(b < c && c < a)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", b, c, a, a, b, c);
		else if(c < a && a < b)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", c, a, b, a, b, c);
		else if(c < b && b < a)
			System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", c, b, a, a, b, c);
	}
}
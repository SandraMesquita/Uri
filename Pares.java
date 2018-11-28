import java.util.Scanner;
public class Pares{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int a, b, c, d, e, contpar = 0, contimpar = 0, contposi = 0, contnega = 0;

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		e = teclado.nextInt();

		if (a % 2 == 0)
			contpar ++;
		if (b % 2 == 0)
			contpar ++;
		if (c % 2 == 0)
			contpar ++;
		if (d % 2 == 0)
			contpar ++;
		if (e % 2 == 0)
			contpar ++;

		if (a % 2 != 0)
			contimpar ++;
		if (b % 2 != 0)
			contimpar ++;
		if (c % 2 != 0)
			contimpar ++;
		if (d % 2 != 0)
			contimpar ++;
		if (e % 2 != 0)
			contimpar ++;

		if (a > 0)
			contposi ++;
		if (b> 0)
			contposi ++;
		if (c > 0)
			contposi ++;
		if (d > 0)
			contposi ++;
		if (e > 0)
			contposi ++;

		if (a < 0)
			contnega ++;
		if (b < 0)
			contnega ++;
		if (c < 0)
			contnega ++;
		if (d < 0)
			contnega ++;
		if (e < 0)
			contnega ++;

		System.out.println(contpar + " valor(es) par(es)");
		System.out.println(contimpar + " valor(es) impar(es)");
		System.out.println(contposi + " valor(es) positivo(s)");
		System.out.println(contnega + " valor(es) negativo(s)");
	}
}
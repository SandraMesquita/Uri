import java.util.Scanner;
public class Media2{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		double n1, n2, n3, p1, p2, p3, peso, media;

		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		p1 = 2.0;
		p2 = 3.0;
		p3 = 5.0;

		peso = p1 + p2 + p3;
		media = (n1 * p1 + n2* p2 + n3 * p3)/ peso;

		System.out.printf("MEDIA = %.1f\n", media);

	}


}
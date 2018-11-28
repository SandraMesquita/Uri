import java.util.Scanner;
public class Media{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		double n1, n2, p1, p2, peso, media;

		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		p1 = 3.5;
		p2 = 7.5;

		peso = p1 + p2;
		media = (n1 * p1 + n2 * p2) / peso;

		System.out.printf("MEDIA = %.5f\n", media);

	}

	
 } 
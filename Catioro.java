import java.util.Scanner;
public class Catioro{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		double dog, pessoal, media;

		dog = teclado.nextDouble();
		pessoal = teclado.nextDouble();

		media = dog / pessoal;

		System.out.printf("%.2f\n", media);

	}
}
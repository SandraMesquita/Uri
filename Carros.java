import java.util.Scanner;
public class Carros{
	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		int km, min;

		km = teclado.nextInt();
		min = km * 2;

		System.out.println(min + " minutos");
	}
}
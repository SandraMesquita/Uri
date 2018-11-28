import java.util.Scanner;
public class Fib{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		double num, res, primeiro, segundo;

		num = teclado.nextDouble();

		primeiro = ((1 + Math.sqrt(5))/2);
		segundo = ((1 - Math.sqrt(5))/2);

		res = (Math.pow(primeiro, num) - Math.pow(segundo, num)) /Math.sqrt(5);

		System.out.printf("%.1f",res);
	}
}import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner (System.in);

		double num, res, primeiro, segundo;

		num = teclado.nextDouble();

		primeiro = ((1 + Math.sqrt(5))/2);
		segundo = ((1 - Math.sqrt(5))/2);

		res = (Math.pow(primeiro, num) - Math.pow(segundo, num)) /Math.sqrt(5);

		System.out.printf("%.1f",res);
	}
}
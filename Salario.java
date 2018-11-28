import java.util.Scanner;
public class Salario{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		int num, hora;
		double val, sal;

		num = teclado.nextInt();
		hora = teclado.nextInt();
		val = teclado.nextDouble();

		sal = hora * val;

		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", sal);
	}
}
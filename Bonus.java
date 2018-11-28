import java.util.Scanner;
public class Bonus{
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);

		double sal, bon, res, por;
		String nome;

		nome = teclado.nextLine();
		sal = teclado.nextDouble();
		bon = teclado.nextDouble();
		por = 0.15;

		res = (bon * por) + sal;

		System.out.printf("TOTAL = R$ %.2f\n", res); 


	}

}
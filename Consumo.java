import java.util.Scanner; 

public class Consumo{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		int estrada;
		double gasosa, res;

		estrada = teclado.nextInt();
		gasosa = teclado.nextDouble();

		res = estrada / gasosa;

		System.out.printf("%.3f", res);
		System.out.println(" Km/l");
	}
}
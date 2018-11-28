import java.util.Scanner;
public class Tiposcomb{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int num, contalco = 0, contgas = 0, contdis = 0;

		num = teclado.nextInt();

		while (num != 4){
			if (num ==1)
				contalco ++;
			else if ( num == 2)
				contgas ++;
			else if ( num == 3)
				contdis ++;
			
			num = teclado.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contalco);
		System.out.println("Gasolina: " + contgas);
		System.out.println("Diesel: " + contdis);
	}
}
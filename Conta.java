import java.util.Scanner;
public class Conta{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);


		int casos, contcasos = 0, num;

		casos = teclado.nextInt();

		while(contcasos < casos){
			num = teclado.nextInt();

			if (num % 2 == 0 ){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}
	}
}
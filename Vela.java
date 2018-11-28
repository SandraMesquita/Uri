import java.util.Scanner;
public class Vela{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int casos, contcasos, hora, min, opera;

		casos = teclado.nextInt();
		contcasos = 0;

		while (contcasos < casos){
			hora = teclado.nextInt();
			min = teclado.nextInt();
			opera = teclado.nextInt();

			if (hora < 10)
				System.out.printf("0%d:", hora);
			else
				System.out.printf("%d:", hora);

			if (min < 10)
				System.out.printf("0%d", min);
			else
				System.out.printf("%d", min);

			if (opera == 1)
				System.out.println(" - A porta abriu!");
			else
				System.out.println(" - A porta fechou!");

			contcasos ++;
		}
	}
}
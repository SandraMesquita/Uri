import java.util.Scanner;
public class SomaImpar{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int casos, contcaso = 0, inicio, fim, contfim = 0;

		casos = teclado.nextInt();
		
		while (contcaso < casos){
			contcaso ++;
			inicio = teclado.nextInt();
			fim = teclado.nextInt();

			if (inicio % 2 == 0){
				inicio ++;
				while (contfim < fim){
					contfim ++;
					inicio += inicio + 2;
				}
			}
			else{
				while (contfim < fim){
					contfim ++;
					inicio += inicio + 2;
				}		
			}
			System.out.println(inicio);
		}
	}
}
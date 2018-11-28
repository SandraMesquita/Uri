import java.util.Scanner;
public class Abas{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		int casos, cont, pag;
		String comando;

		pag = teclado.nextInt();
		casos = teclado.nextInt();
		cont = 0;

		while(cont < casos){
			comando = teclado.nextLine();
				if (comando.equalsIgnoreCase("fechou")){
					pag ++;
				}
				else {
					pag --;
				}
			cont ++;
		}

		System.out.println(pag);
	}
}
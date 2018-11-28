import java.util.Scanner;
public class FelizNatal{

	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		int num, cont = 1;
		String indice = "a";

		num =  teclado.nextInt();

		while (cont <= num){
			indice += "a";
			cont ++;
		}

		System.out.println("Feliz nat" + indice +"l!");
	}
}
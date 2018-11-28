import java.util.Scanner;
public class Saltos{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		float media, peso, casos, menor, maior, aux = 0;

		casos = teclado.nextFloat();

		teclado.next();

		String nome;
		float [] saltos = new float [7];



		for(int i = 0; i < (int)casos; i ++){

			nome= teclado.nextLine();

			peso = teclado.nextFloat();


			for(int index = 0; index < 7; index ++){
				saltos[index] = teclado.nextFloat();
			}

			maior = saltos [0];
			menor = saltos [0];

			for(int j = 0; j < saltos.length; j++){
				if (saltos[j] < menor)
					menor = saltos [j];
				if (saltos [j]> maior)
					maior = saltos[j];
			}

			for (int j = 0; j < saltos.length; j++){
				aux += saltos[j];
			}
			aux -= maior + menor;

			media = aux * peso;

			System.out.printf("%s %.2f\n", nome, media);
		}
	}
}
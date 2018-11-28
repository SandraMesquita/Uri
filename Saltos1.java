import java.util.Scanner;
public class Saltos1{

	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);


		float peso, casos, menor, maior, aux = 0;

		casos = teclado.nextFloat();

		teclado.next();

		String [] nome = new String [(int)casos];
		float [] soma = new float [(int)casos];
		float [] saltos = new float [7];



		for(int i = 0; i < (int)casos; i ++){

			//teclado.next();


			nome[i] = teclado.nextLine();

			peso = teclado.nextFloat();

			teclado.next();


			for(int index = 0; index < 7; index ++){
				saltos[index] = teclado.nextFloat();
			}

			System.out.println("leu");
			teclado.next();

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

			soma[i] = aux * peso;



			//teclado.next();
		}

		for(int i = 0; i < casos; i ++){
			System.out.printf("%s %.2f\n", nome [i], soma[i]);
		}
	}
}
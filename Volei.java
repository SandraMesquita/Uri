import java.util.Scanner;
public class Volei{

	public static void main (String[]args){

		Scanner teclado = new Scanner (System.in);

		double saq, bloq, atk, saqcerto, bloqcerto, atkcerto, casos, somabloq = 0, somasaq = 0, somaatk = 0, somasaqC = 0, somabloqC = 0, somaatkC = 0; 
		double porsaq, porbloq, poratk;
		String nome;

		casos = teclado.nextInt();

		for ( int i = 0; i < casos; i++){

			nome = teclado.next();

			saq = teclado.nextDouble();
			bloq = teclado.nextDouble();
			atk = teclado.nextDouble();
			saqcerto = teclado.nextDouble();
			bloqcerto = teclado.nextDouble();
			atkcerto = teclado.nextDouble();

			somasaq += saq;
			somabloq += bloq;
			somaatk += atk;

			somasaqC += saqcerto;
			somabloqC += bloqcerto;
			somaatkC += atkcerto;
		}

		porsaq = (somasaqC * 100)/ somasaq;
		porbloq = (somabloqC * 100)/ somabloq;
		poratk = (somaatkC * 100)/ somaatk;

		System.out.printf("Pontos de saque: %.2f %%.\n", porsaq);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n", porbloq);
		System.out.printf("Pontos de Ataque: %.2f %%.\n", poratk);
	}
}
import java.util.Scanner;
public class Cobaias{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		double casos, contcasos = 0, num, total = 0, coelhos = 0, ratos = 0, sapos = 0, porcentcoelho, procentrato, porcentsapo;
		String ani;

		casos = teclado.nextInt();

		while (contcasos < casos){
			contcasos ++;

			num = teclado.nextDouble();
			ani = teclado.next();

			total += num;

			if (ani.equalsIgnoreCase("c")){
				coelhos += num;
			}	
			else if (ani.equalsIgnoreCase("r")){
				ratos += num;
				
			}
			else if (ani.equalsIgnoreCase("s")){
				sapos += num;
				
			}

		}
		porcentcoelho = (coelhos * 100)/ total;
		procentrato = (ratos * 100) / total;
		porcentsapo = (sapos * 100)/ total;
			

		System.out.printf("Total: %.0f cobaias\n", total);
		System.out.printf("Total de coelhos: %.0f\n", coelhos);
		System.out.printf("Total de ratos: %.0f\n", ratos);
		System.out.printf("Total de sapos: %.0f\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", porcentcoelho);
		System.out.printf("Percentual de ratos: %.2f %%\n", procentrato);
		System.out.printf("Percentual de sapos: %.2f %%\n", porcentsapo);
	}
}
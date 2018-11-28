import java.util.Scanner;
public class Linha{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);
		int n, m, contn = 0, contm = 0;
		String as = "*";

		n = teclado.nextInt();
		m = teclado.nextInt();

		while ( contn < n){
			contn ++;

			while (contm < m){
				contm ++;
				as += "*";
			}
			System.out.println(as);
		}

	}
}
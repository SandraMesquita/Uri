import java.util.Scanner;
public class Divisor{

	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);

		int res = 0, divisor, naoDivi, multi, naoMulti, i;

		divisor = teclado.nextInt();
		naoDivi = teclado.nextInt();
		multi = teclado.nextInt();
		naoMulti = teclado.nextInt();

		for( i = 1; i <= Math.sqrt(multi); i ++){

			if (i % divisor == 0 && i % naoDivi != 0 && multi % i == 0 && naoMulti % i != 0){
				res += i;
			}

		}
		if (res == multi +1)
			System.out.println(res);

		else
			System.out.println("-1");
	
}}
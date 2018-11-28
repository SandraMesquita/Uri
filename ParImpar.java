import java.util.Scanner;
public class ParImpar{

	public static void main (String[]args){
		Scanner teclado = new Scanner (System.in);

		int [] par = new int [5];
		int [] impar = new int [5];
		int p, i, a;

		p = 0;
		i = 0;

		for (int j = 0; j < 15; j++){

			a = teclado.nextInt();

			if ( a % 2 == 0){
				par[p] = a;
				p ++;
			}

			else{
				impar[i] = a;
				i++;
			}

			if (p == 5){
				for (int b = 0; b < 5; b++){
					System.out.println("par [" + b + "] = " + par[b]);
				}
				p = 0;
			}

			if (i == 5){
				for (int b = 0; b < 5; b++){
					System.out.println("impar [" + b + "] = " + impar[b]);
				i = 0;
				}
			}

			if (j == 14){
				for(int c =0;c < 6; c++){
					if (impar[c] % 2 != 0)
						System.out.println("impar [" + c + "] = " + impar[c]);
					

					if (par[c] % 2 == 0)
						System.out.println("par [" + c + "] = " + par[c]);
					
				}
			}

		}		
	}
}
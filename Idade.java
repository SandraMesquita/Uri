import java.util.Scanner;
public class Idade{
	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int num, ano = 0, mes = 0, dia = 0, moda, modm;

		num = teclado.nextInt();

		moda = num % 365;
		modm = moda % 30;


		if (num >= 365){
			ano = num / 365;
			if (moda != 0 && moda >= 30){
				mes =  moda / 30;

				 if ( modm > 0) {
				 	dia = modm;
				 	System.out.println(ano + " ano (s)");
				 	System.out.println(mes + " mes (es)");
				 	System.out.println(dia + " dia (s)");
				 }
				 else{
				 	System.out.println(ano + " ano (s)");
				 	System.out.println(mes + " mes (es)");
				 	System.out.println(dia + " dia (s)");
				 }
			}
			else{
				dia = moda;
				System.out.println(ano + " ano (s)");
				System.out.println(mes + " mes (es)");
				System.out.println(dia + " dia (s)");
			}

		}
		else{
			mes = num / 30;
			 if ((num % 30 != 0)) {
				dia = num % 30;
				System.out.println(ano + " ano (s)");
				System.out.println(mes + " mes (es)");
				System.out.println(dia + " dia (s)");
				}
			else{
				System.out.println(ano + " ano (s)");
				System.out.println(mes + " mes (es)");
				System.out.println(dia + " dia (s)");
			}
		}
	}
}
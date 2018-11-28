import java.util.Scanner;
public class Lanche{
	public static void main(String[]args){
		
		Scanner teclado = new Scanner(System.in);
		
		int cod, quant;
		double res;

		cod = teclado.nextInt();
		quant = teclado.nextInt();

		switch (cod){
			case 1: 
				res = quant * 4.0;
				System.out.printf("Total: R$ %.2f\n", res);
				break;
			case 2: 
				res = quant * 4.50;
				System.out.printf("Total: R$ %.2f\n", res);
				break;
			case 3: 
				res = quant * 5.0;
				System.out.printf("Total: R$ %.2f\n", res);
				break;
			case 4:  
				res = quant * 2.0;
				System.out.printf("Total: R$ %.2f\n", res);
				break;
			case 5: 
				res = quant * 1.50;
				System.out.printf("Total: R$ %.2f\n", res);
				break;

		}
	}
}
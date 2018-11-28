import java.io.IOException;
 import java.util.Scanner;
public class Testeselecao {
 
    public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int a , b, c, d;

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
	

		if ((b > c) && (d > a)) {
			
			 if ((c + d) > (a + b)) {
			 	if ((c > 0) && (d > 0)) {
			 		if (a%2==0){
			 			System.out.println("Valores aceitos");
			 		}
			 	}
			 }
			 	
		} 
			
		else
			System.out.print("Valores nao aceitos");
	}
}
 import java.util.Scanner;
 public class Tempo{

 	public static void main (String[]args){

 		Scanner teclado = new Scanner(System.in);

 		int a, b, c, media;

 		a =teclado.nextInt();
 		b =teclado.nextInt();
 		c =teclado.nextInt();

		if((a - b == 0) || (a - c == 0) || (b - c == 0) || (a + b - c ==0) || (a + c - b == 0) || (b + c - a == 0)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
 	}
 }
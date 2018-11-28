import java.util.Scanner;
public class Triangulo2{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		int num1, num2, num3, a = 0, b = 0, c = 0;

		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();


		if (num1 > num2 && num1 > num3){
			a += num1;
			b += num2;
			c += num3;
		}
		else if (num2 > num1 && num2 > num3){
			a += num2;
			b += num1;
			c += num3;
		}
		
		else if (num3 > num1 && num3 > num2){
			a += num3;
			b += num1;
			c += num2;
		}
		else if (num1 == num2 && num2 == num3){
			a += num1;
			b += num2;
			c += num3;
		}
		else if (num1 == num2 && num2 != num3){
			a += num1;
			b += num2;
			c += num3;
		}
		else if (num2 == num3 && num3 != num1){
			a += num2;
			b += num3;
			c += num1;
		}
		else if (num1 == num3 && num3 !=num2){
			a += num1;
			b += num3;
			c += num2;
		}

		if ( a > (b + c))
			System.out.println("Invalido");


		else {
			
			if ((a != b) && (b != c))
				System.out.println("Valido-Escaleno");
			else if (a == b && b == c)
				System.out.println("Valido-Equilatero");
			else if ((a == b && b != c) || (b == c && c != a) || (a == c && c !=b))
				System.out.println("Valido-Isoceles");
			
			if ((a * a) == ((b * b) + (c * c)))
				System.out.println("Retangulo: N");
			else
				System.out.println("Retangulo: S");
		}
	}
}
import java.util.Scanner;
public class Aumentosalario{
	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		float sal, aum, res;

		sal = teclado.nextFloat();

		if (sal > 0 && sal <= 400.00){
			aum = sal * 0.15f;
			res = sal + aum;

			System.out.printf("Novo salario: %.2f\n", res);
			System.out.printf("Reajuste ganho: %.2f\n", aum);
			System.out.println("Em percentual: 15 %");
		}
		else if (sal > 400.00 && sal <= 800.00){
			aum = sal * 0.12f;
			res = sal + aum;

			System.out.printf("Novo salario: %.2f\n", res);
			System.out.printf("Reajuste ganho: %.2f\n", aum);
			System.out.println("Em percentual: 12 %");
		}
		else if (sal > 800.00 && sal <= 1200.00){
			aum = sal * 0.10f;
			res = sal + aum;

			System.out.printf("Novo salario: %.2f\n", res);
			System.out.printf("Reajuste ganho: %.2f\n", aum);
			System.out.println("Em percentual: 10 %");
		}
		else if (sal > 1200.00 && sal <= 2000.00){
			aum = sal * 0.07f;
			res = sal + aum;

			System.out.printf("Novo salario: %.2f\n", res);
			System.out.printf("Reajuste ganho: %.2f\n", aum);
			System.out.println("Em percentual: 7 %");
		}
		else if (sal > 2000.00){
			aum = sal * 0.04f;
			res = sal + aum;

			System.out.printf("Novo salario: %.2f\n", res);
			System.out.printf("Reajuste ganho: %.2f\n", aum);
			System.out.println("Em percentual: 4 %");
		}
	}
}
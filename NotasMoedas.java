import java.util.Scanner;
public class NotasMoedas{

	public static void main (String[]args){

		Scanner teclado = new Scanner(System.in);

		double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        double centavos, n, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;

        n = teclado.nextDouble();


		n100 = n / 100.0;
        n %= 100;
        n50 = n / 50.0;
        n %= 50;
        n20 = n / 20.0;
        n %= 20;
        n10 = n / 10.0;
        n %= 10;
        n5 = n / 5.0;
        n %= 5;
        n2 = n / 2.0;
       	n %= 2;
        n1 = n / 1.0;
        n %= 1;

        centavos = n * 100;
        m50 = centavos / 50;
        centavos %= 50;
        m25 = centavos / 25;
        centavos %= 25;
        m10 = centavos / 10;
        centavos %= 10;
        m5 = centavos / 5;
        centavos %= 5;
        m1 = centavos;

        System.out.println("NOTAS:");
        System.out.println((int)n100 + " nota(s) de R$ 100,00");
        System.out.println((int)n50 + " nota(s) de R$ 50,00");
        System.out.println((int)n20 + " nota(s) de R$ 20,00");
        System.out.println((int)n10 + " nota(s) de R$ 10,00");
        System.out.println((int)n5 + " nota(s) de R$ 5,00");
        System.out.println((int)n2 + " nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println((int)n1 + " moeda(s) de R$ 1,00");
        System.out.println((int)m50 + " moeda(s) de R$ 0,50");
        System.out.println((int)m25 + " moeda(s) de R$ 0,25");
        System.out.println((int)m10 + " moeda(s) de R$ 0,10");
        System.out.println((int)m5 + " moeda(s) de R$ 0,05");
        System.out.println((int)m1 + " moeda(s) de R$ 0,01");

	}
}
import java.util.Scanner;
public class Area {
    public static final double PI = 3.14159;
 
    public static void main(String[] args){
 
       Scanner teclado = new Scanner(System.in);

		double a, b, c, tri, cir, tra, ret, qua;

		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();

		tri = (a * c)/ 2;
		cir = PI * (c * c);
		tra = ((a + b) * c)/ 2;
		qua = b * b;
		ret = a * b;

		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
 
    }
 
}
import java.util.Scanner;
public class Esfera {
    
    public static final double PI = 3.14159;
    
	public static void main(String[]args){

		Scanner teclado = new Scanner (System.in);

		Double div, raio, vol;

		raio = teclado.nextDouble();
		div = (4.0/3.0);

		vol = div * PI * (raio * raio * raio);

		System.out.printf("VOLUME = %.3f\n", vol);
	}
}
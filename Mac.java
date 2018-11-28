import java.util.Scanner;
public class Mac{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int lanche;
		double prod, contprod = 0, quanlanche, res = 0;

		prod = teclado.nextDouble();

		while(contprod < prod){

			lanche = teclado.nextInt();
			quanlanche = teclado.nextDouble();

			switch (lanche){
				case 1001:
					res += quanlanche * 1.50;
					break;
				case 1002:
					res += quanlanche * 2.50;
					break;
				case 1003:
					res += quanlanche * 3.50;
					break;
				case 1004:
					res += quanlanche * 4.50;
					break;
				case 1005:
					res += quanlanche * 5.50;
					break;
			}
			contprod ++;
		}
		System.out.printf("%.2f\n", res);
	}
}
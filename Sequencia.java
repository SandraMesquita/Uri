import java.util.Scanner;
public class Sequencia{

	public static void main(String[]args){

		int i, j;

		i = 1;
		j = 7;

		while (i < 10 && j < 16){
			System.out.println("I=" + i + " J=" + j--);
			System.out.println("I=" + i + " J=" + j--);
			System.out.println("I=" + i + " J=" + j);

			i += 2;
			j += 4;
		}
	}
}
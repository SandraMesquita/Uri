import java.util.Scanner;
public class Tuitando{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		String tweet;

		tweet = teclado.nextLine();

		if (tweet.length() < 140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");
	}
}
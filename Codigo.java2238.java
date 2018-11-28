import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {


		long a, b, c, d, res;
		Scanner sc = new Scanner(System.in);


		a = sc.nextInt();
		b = sc.nextInt();      
		c = sc.nextInt();
		d = sc.nextInt();


		res = c + 1;

		for(long i = 1; i*i < c; i++){
			if( c % i == 0){
				if( i % a == 0 && i % b != 0 && c % i == 0 && d % i != 0){
					if( res > i){
						res = i;
					}
				}
				if( (c/i) % a == 0 && (c/i) % b != 0 && c % (c/i) == 0 && d % (c/i) != 0){
					if( res > c/i){
						res = c/i;
					}
				}
			}
		}
		if( res == c + 1){
			res = -1;
		}

		System.out.println(res);
	}
}
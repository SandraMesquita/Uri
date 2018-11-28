import java.util.Scanner;
public class Media3{
	public static void main(String[]args){

		 Scanner teclado = new Scanner (System.in);

		 double p1, p2, p3, p4, n1, n2, n3, n4, media, exa , fim; 
		 
		 p1 = 2;
		 p2 = 3;
		 p3 = 4;
		 p4 = 1;

		 n1 = teclado.nextDouble();
		 n2 = teclado.nextDouble();
		 n3 = teclado.nextDouble();
		 n4 = teclado.nextDouble();

		 media = ((n1*p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4);



		 if (media >= 7.0)
		 {
		 	System.out.printf("Media: %.1f\n", media);
		 	System.out.println("Aluno aprovado.");
		 }
		 	

		 else if ( (media >= 5.0) && (media <= 6.9))
		 {
		 	exa = teclado.nextDouble();

		 	fim = (media + exa) / 2;

		 	System.out.printf("Media: %.1f\n", media);
		 	System.out.println("Aluno em exame.");

		 	 	if (fim >= 5.9)
		 	 	 {
		 	 	 	System.out.printf("Nota do exame: %.1f\n", exa);
		 			System.out.println("Aluno aprovado.");
		 			System.out.printf("Media final: %.1f\n", fim);
		 		 }

		 		else
		 		 {
		 		 	System.out.printf("Nota do exame: %.1f\n", exa);
		 			System.out.println("Aluno reprovado.");
		 			System.out.printf("Media final: %.1f\n", fim);
		 		 }
		}
		else if ( media < 5.0)
		 {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}
	}	

}
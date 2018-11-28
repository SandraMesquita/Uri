import java.util.Scanner;
public class Animal{
	public static void main(String[]args){
	
	Scanner teclado = new Scanner(System.in);

		String palavra1, palavra2, palavra3;

		palavra1 = teclado.next();
		palavra2 = teclado.next();
		palavra3 = teclado.next();

		if (palavra1.equalsIgnoreCase("vertebrado")){

			if(palavra2.equalsIgnoreCase("ave"))
			{
				if(palavra3.equalsIgnoreCase("carnivoro"))
					System.out.println("aguia");
				else if (palavra3.equalsIgnoreCase("onivoro"))
					System.out.println("pomba");
			}
			else if (palavra2.equalsIgnoreCase("mamifero"))
			{
				if(palavra3.equalsIgnoreCase("onivoro"))
					System.out.println("homem");
				else if(palavra3.equalsIgnoreCase("herbivoro"))
					System.out.println("vaca");
			}

		}
		else if (palavra1.equalsIgnoreCase("invertebrado"))
		{
			if (palavra2.equalsIgnoreCase("inseto"))
			{
				if (palavra3.equalsIgnoreCase("hematofago"))
					System.out.println("pulga");
				else if (palavra3.equalsIgnoreCase("herbivoro"))
					System.out.println("lagarta");
			}
			else if (palavra2.equalsIgnoreCase("anelideo"))
			{
				if (palavra3.equalsIgnoreCase("hematofago"))
					System.out.println("sanguessuga");
				else if (palavra3.equalsIgnoreCase("onivoro"))
					System.out.println("minhoca");
			}
		}
	}
}
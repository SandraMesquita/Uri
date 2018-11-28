import java.util.Scanner;
public class Imposto{
	public static void main (String[]args){

	 Scanner teclado = new Scanner(System.in);
    
     Double salario, imposto;

     imposto = 0.0;
     salario = teclado.nextDouble();
    
     if (salario > 2000){
        if(salario > 3000){
            imposto += (3000 - 2000) * 0.08f;
            
            if(salario > 4500){
                imposto += (salario - 4500) * 0.28f;
                imposto += (4500 - 3000) * 0.18f;
            }
            else
            imposto += (salario - 3000) * 0.18f;
        }
        else
        imposto += (salario - 2000) * 0.08f;
    }
    if(imposto > 0)
    System.out.printf("R$ %.2f\n", imposto);
    
    else
    System.out.println("Isento");
 
    }
 
}
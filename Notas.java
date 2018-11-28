import java.util.Scanner;
public class Notas{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		int val, cem = 0, cinq = 0, vin = 0, des = 0, cinco = 0, dois = 0, um = 0, modc, modcinq, modvin, moddes, modcinco, moddois;

		val = teclado.nextInt();

		modc = val % 100;
		modcinq = modc % 50;
		modvin = modcinq % 20;
		moddes = modvin % 10;
		modcinco = moddes % 5;
		moddois = modcinco % 2;

		if ( val > 100){
			cem = val / 100;
			if (modc !=0 && modc >= 50){
				cinq = modc / 50;

				if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						 }	
					} 
				}
				//else do 20
				else{
					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
				}
			}
			//else do 50
			else{
			if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						 }	
					} 
				}
				//else do 20
				else{
					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
				}
			}
		}
		//else do 100
		else{
						cem = val / 100;
			if (modc !=0 && modc >= 50){
				cinq = modc / 50;

				if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						 }	
					} 
				}
				//else do 20
				else{
					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
				}
			}
			//else do 50
			else{
			if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						 }	
					} 
				}
				//else do 20
				else{
					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){
								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
					 else{
					 	des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
						else{
							cinco = 0;
							if (modcinco >= 2){

								dois = modcinco / 2;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
							else{
								dois = 0;
								if (moddois >= 1)
									um ++;
								else
									um = 0;
							}
						}
					}
				}
			}
		}
	

		System.out.println(val);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vin + " nota(s) de R$ 20,00");
		System.out.println(des + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
	}
}
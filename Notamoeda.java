import java.util.Scanner;
public class Notamoeda{

	public static void main(String[]args){

		Scanner teclado = new Scanner(System.in);

		double val, cem = 0, cinq = 0, vin = 0, des = 0, cinco = 0, dois = 0, um = 0, modc, modcinq, modvin, moddes, modcinco, moddois, modum;
		double cinqCents, vintCincCents, desCents, cincoCents, cinqc = 0, vintc = 0, desc = 0, cinc = 0, umc = 0;

		val = teclado.nextInt();

		modc = val % 100;
		modcinq = modc % 50;
		modvin = modcinq % 20;
		moddes = modvin % 10;
		modcinco = moddes % 5;
		moddois = modcinco % 2;
		modum = moddois % 1;

		cinqCents = modum % 0.50;
		vintCincCents = cinqCents % 0.25;
		desCents = vintCincCents % 0.10;
		cincoCents = desCents % 0.5; 

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

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}//else do 20
				else{
					vin = 0;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}		
			}
			// else do 50
			else {
				cinc = 0;

				if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}//else do 20
				else{
					vin = 0;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}	
			}
		}// else do 100
		else{
			cem = 0;
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

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}//else do 20
				else{
					vin = 0;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}		
			}
			// else do 50
			else {
				cinc = 0;

				if (modcinq >= 20){
					vin = modcinq / 20;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}//else do 20
				else{
					vin = 0;

					if (modvin >= 10){
						des = modvin / 10;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}		
					}
					// else do 10
					else{
					 des = 0;

						if (moddes >= 5){
							cinco = moddes / 5;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}
						//else do cinco reais
						else{
							cinco = 0;

							if (modcinco >= 2){
								dois = modcinco / 2;

								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}
							}
							//else 2 reais
							else{
								dois = 0;
							
								if (moddois >= 1){
									um ++;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								} 
								//else 1 real
								else{
									um = 0;

									if (modum >= 0.50){
										cinqc = modum / 0.50;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}//cinquenta centavos
									else{
										cinqc = 0;

										if (cinqCents >= 0.25){
											vintc = cinqCents / 0.25;

											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}	
										}// vinte e cinco centavos
										else{
											vintc = 0;
											
											if (vintCincCents >= 0.10){
												desc = vintCincCents / 0.10;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}// dez centavos
											else{
												desc = 0;

												if (desCents >= 0.05){
													cinc = desCents / 0.05;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}//cinco centavos
												else{
													cinc = 0;

													if ( cincoCents >= 0.01){
														umc = cincoCents / 0.01;
													}
													else
														umc = 0;
												}
											}
										}
									}
								}	
							}
						}	
					}
				}	
			}
		}
		System.out.println("NOTAS:");
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vin + " nota(s) de R$ 20,00");
		System.out.println(des + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println("MOEDAS:");
		System.out.println(um + " moeda(s) de R$ 1,00");
		System.out.println(cinqc + " moeda(s) de R$ 0,50");
		System.out.println(vintc + " moeda(s) de R$ 0,25");
		System.out.println(desc + " moeda(s) de R$ 0,10");
		System.out.println(cinc + " moeda(s) de R$ 0,05");
		System.out.println(umc + " moeda(s) de R$ 0,01");
	}
}
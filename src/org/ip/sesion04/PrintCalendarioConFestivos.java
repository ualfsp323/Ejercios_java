package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendarioConFestivos {

		public static final String ANSI_RESET = "\u001B[0m";
	    public static final String ANSI_RED = "\u001B[31m";
	    
		public static void main(String[] args) {
		      Scanner imput = new Scanner(System.in);			

			System.out.print("Introduzca un anio (por ejemplo, 2020, que es bisiesto): ");
			int anio = imput.nextInt();

			System.out.print("Introduzca un mes como un numero entre 1 (enero) y 12 (diciembre): ");
			int mes = imput.nextInt();

			printMes(anio, mes);
			
			imput.close();
		}

		public static void printMes(int anio, int mes) {
			// Muestra la cabecera del calendario
			printTituloMes(anio, mes);

			// Muestra el cuerpo del calendario
			printCuerpoMes(anio, mes);
		}

		/** printTituloMes puede parecerse a esto */
		public static void printTituloMes(int anio, int mes) {
			System.out.println("");
			System.out.println("         "+getNombreMes(mes)+" "+ anio);
			System.out.println(" ---------------------------");
			System.out.println(" Lun Mar Mie Jue Vie Sab Dom");
		}

		public static boolean esFestivoNacionalFijo(int mes, int dia) {
			boolean Fest = true;
			if (mes == 1 && dia == 1 ) {
				return Fest;
				
			}else if (mes == 1 && dia == 6 ) {
				return Fest;
				
			}else if (mes == 8 && dia == 15 ) {
				return Fest;
				
			}else if (mes == 10 && dia == 12 ) {
				return Fest;
				
			}else if (mes == 11 && dia == 1 ) {
				return Fest;
				
			}else if (mes == 12 && dia == 6 ) {
				return Fest;
				
			}else if (mes == 12 && dia == 8 ) {
				return Fest;
				
			}else {
			return Fest = false;
			}
		}
		
		public static void printCuerpoMes(int anio, int mes) {
			
			// Obtiene el dia de la semana en la que empieza el mes
			int diaInicio = getDiaInicio(anio, mes);

			// Obtiene el numero de dias del mes
			int numeroDeDiasDelMes = getNumeroDeDiasDelMes(anio, mes);
			// Tratamos aparte el domingo para dejar bien los espacios
		    if (diaInicio == 0){
		    	diaInicio = 7;
		    }

		    // Dejamos 4 espacios por cada día antes del primer dia del mes
			int i;
			for (i = 1; i < diaInicio; i++)
				System.out.print("    ");

			// Escribimos los días
			// IMPORTANTE: No olvides modificar este bucle para que los domingos se muestren en rojo
			for (i = 1; i <= numeroDeDiasDelMes; i++) {
				
				if ((i + diaInicio - 1) % 7 == 0){
					
					 System.out.println("  "+ANSI_RED +i+ANSI_RESET);
				}else if (esFestivoNacionalFijo( mes, i)) {
					
				    System.out.print("   "+ANSI_RED +i+ANSI_RESET);
			    }else {
					System.out.printf("%4d", i);
				}
				
			    }
			    

			System.out.println();
		}

		/** getNombreMes puede parecerse a esto */
		public static String getNombreMes(int mes) {
			switch (mes) {
			case 1:
				return "Enero";
			case 2:
				return "Febrero";
			case 3:
				return "Marzo";
			case 4:
				return "Abril";
			case 5:
				return "Mayo";
			case 6:
				return "Junio";
			case 7:
				return "Julio";
			case 8:
				return "Agosto";
			case 9:
				return "Septiembre";
			case 10:
				return "Octubre";
			case 11:
				return "Nobiembre";
			case 12:
				return "Diciembre";
			default:
						}
			return null;
			 
		}

		/** Obtiene el dia de comienzo de 1/mes/anio */
		public static int getDiaInicio(int anio, int mes){
			int d = 1;
			int y0 = anio - (14 - mes) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = mes + 12 * ((14 - mes) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}

		/** getNumeroTotalDeDiasDelMes puede parecerse a esto */
		public static int getNumeroDeDiasDelMes(int anio, int mes) {
			switch (mes) {
			case 1:
				return  31;
			case 2:
				if( esBisiesto(anio)) {
					return 29;
				} else {
					return 28;
	            }
				
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			case 8:
				return 30;
			case 9:
				return 31;
			case 10:
				return 30;
			case 11:
				return 31;
			case 12:
				return 30;
			default:
						}
			return mes;
			
		}

		/** Determina si el anio es bisiesto */
		public static boolean esBisiesto(int anio) {
			return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
		}


  }


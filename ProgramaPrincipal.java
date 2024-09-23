package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	
	public static void main(String[] args) {
		
		//Bloque de declaración de variables e inicializado

		String opciones;
		float num1=0.0f;
		float num2=0.0f;
		int num3=0;
		float resultado=0.0f;
		
		//Bloque de entrada de datos
		
		do {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
			System.out.println("Introduzca una opción del menú:");
			System.out.println("1.  Sumar (+)");
			System.out.println("2.  Restar (-)");
			System.out.println("3.  Multiplicar (*)");
			System.out.println("4.  Dividir (/)");
			System.out.println("5.  Factorial (!)");
			System.out.println("0.  Salir (S o s)");
			System.out.println("Introduzca una opción:");
			
			opciones = sc.nextLine();
			
			switch (opciones) {
			case "1", "+":
				System.out.println("Introduzca el primer número");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				resultado= sumaDosNumeros(num1,num2);
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 + num2);
				
				//Bloque de salida de datos
				
				System.out.println("La suma de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "2", "-":
				System.out.println("Introduzca el primer número");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				resultado = restaDosNumeros (num1, num2);
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 - num2);
				
				//Bloque de salida de datos
				
				System.out.println("La resta de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "3", "*":
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				resultado = multi (num1*num2, resultado);
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 * num2);
				
				//Bloque de salida de datos
				
				System.out.println("La multiplicación de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "4", "/":
				
				try {
					System.out.println("Introduzca el primer número:");
					num1 = Float.parseFloat(sc.nextLine());
					System.out.println("Introduzca el segundo número:");
					num2 = Float.parseFloat(sc.nextLine());
					resultado = divDosNumeros (num1/num2, resultado);
					
					//Bloque de transformación de datos
					
					resultado = (float) (num1 / num2);
					
					//Bloque de salida de datos
					
					System.out.println("La división de "+num1+" y "+num2+" es:"+resultado);
					
				}	catch (Exception e) {
					
					System.out.println("Error al dividir por 0");
				}
				break;
				
				//Bloque de entrada de datos
				
			case "5", "!":
				System.out.println("Introduzca un número: ");
				num3 = Integer.parseInt(sc.nextLine());
				while (num3<=0) {
				System.out.println("Error, valor no válido. Introduzca un valor superior a 0");
				num3 = Integer.parseInt(sc.nextLine());
				}
				System.out.println("El factorial de "+num3+"es"+factorial((int)num3));
				break;
				
				//Bloque de salida de datos
				
				case "0", "S", "s":
				System.out.println("El programa ha finalizado");
			break;
			
			default: System.err.println("Opción incorrecta"); break;
			
			}
			
			
			
		} while (!opciones.equalsIgnoreCase("s")&&!opciones.equals("0"));
		
			
		
	}
	
	//Funciones de las diferentes operaciones
	
	public static float sumaDosNumeros (float param1, float param2) {
		float resultado;
		resultado = param1+param2;
		return resultado;
	}
	
	public static float restaDosNumeros (float param1, float param2) {
		float resultado;
		resultado = param1-param2;
		return resultado;
	}
	
	public static float multi (float param1, float param2) {
		float resultado;
		resultado = param1*param2;
		return resultado;
	}
	
	public static float divDosNumeros (float param1, float param2) {
		float resultado;
		resultado = param1/param2;
		return resultado;
	}

	public static int factorial(int num3) {
		int resultado;
		resultado = num3;
		return resultado;
	}

}

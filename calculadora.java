import java.util.Scanner;

public class calculadora {
	public static void main(String[] args){
		//menu();
		Scanner input=new Scanner(System.in);
		System.out.println("Seleccione una opcion");
		System.out.println("1. factorial");
		System.out.println("2. raiz cuadrada");
		System.out.println("3. Salir");
		int opcion = input.nextInt();
		while (opcion!=3){
			switch (opcion){
				case 1:
					System.out.println("-----Factorial------");
					System.out.println("Ingrese un numero");
					int facto = input.nextInt();
					System.out.println("El factorial es: "+factorial(facto));
					menu();
					opcion = input.nextInt();
					break;
				case 2:
					System.out.println("-----Raíz Cuadrada------");
					System.out.println("Ingrese un numero");
					int num = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+raiz(num));
					menu();
					opcion = input.nextInt();
					break;
				default:
					System.out.println("Opcion no valida");
					menu();
					opcion = input.nextInt();
					break;
			}
		}

	}
	public static void menu(){
		System.out.println("Seleccione otra opcion");
		System.out.println("1. factorial");
		System.out.println("2. Salir");

	}
	public static int factorial(int numero){
		int facto=1;
		while (numero!=0){
			facto = facto*numero;
			numero--;
		}
		return facto;
	}

	public static int potencia(int numero){
		int potencia = numero * numero;
		return potencia;
	}
	
	public static float raiz(int numero)
	{
		float resultado1 = (float) Math.sqrt(numero);
		return resultado1;
	}
}

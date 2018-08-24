import java.util.Scanner;

public class calculadora {
	public static void main(String[] args){
		//menu();
		Scanner input=new Scanner(System.in);
		System.out.println("Seleccione una opcion");
		System.out.println("1. factorial");
		System.out.println("2. Salir");
		int opcion = input.nextInt();
		while (opcion!=2){
			switch (opcion){
				case 1:
					System.out.println("-----Factorial------");
					System.out.println("Ingrese un numero");
					int facto = input.nextInt();
					System.out.println("El factorial es: "+factorial(facto));
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
}

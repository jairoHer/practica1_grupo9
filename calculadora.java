import java.util.Scanner;

public class calculadora {
	public static void main(String[] args){
		//menu();
		Scanner input=new Scanner(System.in);
		System.out.println("Seleccione una opcion");
		System.out.println("1. factorial");
		System.out.println("2. raiz cuadrada");
		System.out.println("3. Potencia cubica");
		System.out.println("4. raiz cubica");
		System.out.println("5. Salir");
		int opcion = input.nextInt();
		while (opcion!=5){
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
				case 3:
					System.out.println("-----Potencia cubica------");
					System.out.println("Ingrese un numero");
					int num = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+potenciaCubo(num));
					menu();
					opcion = input.nextInt();
					break;
				case 4:
					System.out.println("-----Raíz Cubica------");
					System.out.println("Ingrese un numero");
					int num = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+raizCubo(num));
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

	public static float potenciaCubo(int numero){
		int exponente = 3;
		float resultado = (float)Math.Pow(numero,exponente);
		return resultado;
	}

	public static float raizCubo(int numero){
		float resultado=(float)Math.pow(numero,1.0/3.0);
		return resultado;
	}
}

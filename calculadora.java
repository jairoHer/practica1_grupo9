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
		System.out.println("5. Multiplicacion");
		System.out.println("6. Division");
		System.out.println("7. Potencia Cuadrada");
		System.out.println("8. Salir");
		int opcion = input.nextInt();
		while (opcion!=8){
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
					int num1 = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+potenciaCubo(num1));
					menu();
					opcion = input.nextInt();
					break;
				case 4:
					System.out.println("-----Raíz Cubica------");
					System.out.println("Ingrese un numero");
					int numR = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+raizCubo(numR));
					menu();
					opcion = input.nextInt();
					break;
				case 5:
					System.out.println("-----Multiplicacion------");
					System.out.println("Ingrese el primer numero");
					int mult1 = input.nextInt();
					System.out.println("Ingrese el segundo numero");
					int mult2 = input.nextInt();
					System.out.println("El resultado de su multiplicacion es: "+multiplicacion(mult1,mult2));
					menu();
					opcion = input.nextInt();
					break;
				case 6:
					System.out.println("-----Division------");
					System.out.println("Ingrese el primer numero");
					int div1 = input.nextInt();
					System.out.println("Ingrese el segundo numero");
					int div2 = input.nextInt();
					System.out.println("El resultado de su division es: "+division(div1,div2));
					menu();
					opcion = input.nextInt();
					break;
				case 7:
					System.out.println("-----Potencia Cuadrada------");
					System.out.println("Ingrese un numero");
					int pow = input.nextInt();
					System.out.println("La raíz cuadrada del numero es es: "+potencia(pow));
					menu();
					opcion = input.nextInt();
					break;
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
		System.out.println("2. raiz cuadrada");
		System.out.println("3. Potencia cubica");
		System.out.println("4. raiz cubica");
		System.out.println("5. Multiplicacion");
		System.out.println("6. Division");
		System.out.println("7. Potencia Cuadrada");
		System.out.println("8. Salir");

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
		float resultado = (float)Math.pow(numero,exponente);
		return resultado;
	}

	public static float raizCubo(int numero){
		float resultado=(float)Math.pow(numero,1.0/3.0);
		return resultado;
	}
	public static int multiplicacion(int numero1, int numero2){
		int resultado =0;
		resultado = numero1*numero2;
		return resultado;
	}
	public static int division(int numero1, int numero2){
		int resultado =0;
		resultado = numero1/numero2;
		return resultado;
	}
}
	
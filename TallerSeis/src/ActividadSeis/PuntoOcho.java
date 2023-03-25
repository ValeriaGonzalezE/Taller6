package ActividadSeis;
import java.util.Scanner;
public class PuntoOcho {
	static Scanner sc = new Scanner(System.in);
    static int[][] arregloA, arregloB, arregloResultado;
    static int filaA, columnaA, filaB, columnaB;


	public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        char opcion;
        

        do {
            System.out.println("\nMenu de Operaciones con Arreglos\n");
            System.out.println("A. Ingresar Arreglo A");
            System.out.println("B. Ingresar Arreglo B");
            System.out.println("C. Mostrar A + B");
            System.out.println("D. Mostrar A - B");
            System.out.println("E. Mostrar A * B");
            System.out.println("F. Salir\n");

            System.out.print("Ingrese la opcion deseada: ");
            opcion = sc.next().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    ingresarArreglo('A');
                    break;
                case 'B':
                    ingresarArreglo('B');
                    break;
                case 'C':
                	arregloResultado('C');
                	if (comprobarDimensiones());
                	
                    break;
                case 'D':
                	arregloResultado('D');
                	if (comprobarDimensiones());
                     
                    break;
                case 'E':
                	arregloResultado('E');
                    if (comprobarmultiplicacion());
                      
                    break;
                case 'F':
                    System.out.println(" ¡Hasta luego!");
                    break;
                default:
                    System.out.println(" Opción inválida. Por favor intente de nuevo.");
            }

        } while (opcion != 'F');
    }

    private static boolean comprobarDimensiones() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean comprobarmultiplicacion() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void ingresarArreglo(char arreglo) {
        int fila, columna;
        
        System.out.println(" Ingrese las dimensiones del arreglo " + arreglo + ": ");
        System.out.print(" Número de filas: ");
        fila = sc.nextInt();
        System.out.print(" Número de columnas: ");
        columna = sc.nextInt();
        
        if (arreglo == 'A') {
            filaA = fila;
            columnaA = columna;
            arregloA = new int[filaA][columnaA];

            System.out.println("\nIngrese los valores para el arreglo A: ");
            for (int i = 0; i < filaA; i++) {
                for (int j = 0; j < columnaA; j++) {
                    System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                    arregloA[i][j] = sc.nextInt();
                }
            }
        } else if (arreglo == 'B') {
            filaB = fila;
            columnaB = columna;
            arregloB = new int[filaB][columnaB];

            System.out.println("\nIngrese los valores para el arreglo B: ");
            for (int i = 0; i < filaB; i++) {
                for (int j = 0; j < columnaB; j++) {
                    System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                    arregloB[i][j] = sc.nextInt();
                    
                }
            }
        }
        
      	
    }
	public static void arregloResultado(char arreglo) {
		int total;
		if(arreglo == 'C') {
			System.out.println("la suma de los arreglos A y B es: ");
			for (int i = 0; i < arregloA.length; i++) {
				for (int j = 0; j < arregloB.length; j++) {
					total = arregloA[i][j] + arregloB[i][j];
			        System.out.println(  total  );
				}	
			}
		}else if(arreglo == 'D') {
			System.out.println("la resta de los arreglos A y B es: ");
			for (int i = 0; i < arregloA.length; i++) {
				for (int j = 0; j < arregloB.length; j++) {
					total = arregloA[i][j] - arregloB[i][j];
			        System.out.println(  total  );
				}	
			}
		} else if(arreglo == 'E') {
			System.out.println("la multiplicacion de los arreglos A y B es: ");
		
		
		        int[][] producto = new int[arregloB.length][arregloB[0].length];

		        for (int a = 0; a < arregloB[0].length; a++) {
		            for (int i = 0; i < arregloA.length; i++) {
		                int suma = 0;

		                for (int j = 0; j < arregloA[0].length; j++) {

		                    suma += arregloA[i][j] * arregloB[j][a];
		                }

		                producto[i][a] = suma;
		            }
		        }


		        System.out.print("Imprimiendo producto\n");
		        for (int i = 0; i < arregloB.length; i++) {
		            for (int j = 0; j < arregloB[0].length; j++) {
		                System.out.printf("%d ", producto[i][j]);
		            }
		            System.out.print("\n");
		        }
		    }
		
			 

					
			
		}
}
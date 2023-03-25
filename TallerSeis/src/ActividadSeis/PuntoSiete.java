package ActividadSeis;
import java.util.Scanner;
public class PuntoSiete {

	
	   public static void main(String[] args) {
	      
	      int[] resultados = new int[5];
	      Scanner imput = new Scanner(System.in);
	      
	      // Pedir los resultados de las pruebas y guardarlos en el array "resultados"
	      for (int i = 0; i < 5; i++) {
	         System.out.print("Ingresa el resultado de la prueba " + (i+1) + ": ");
	         resultados[i] = imput.nextInt();
	      }
	      
	      // Calcular el promedio de los resultados
	      int suma = 0;
	      for (int i = 0; i < 5; i++) {
	         suma += resultados[i];
	      }
	      double promedio = (double) suma / 5;
	      
	      // Imprimir el promedio
	      System.out.println("El promedio de los resultados es: " + promedio);
	   }
}

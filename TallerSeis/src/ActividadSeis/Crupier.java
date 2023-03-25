package ActividadSeis;

import java.util.Scanner;

public class Crupier {

	static Scanner sc = new Scanner(System.in);
	public  void sistema(){
		
	    int[] A= new int[13];
	    System.out.println("\n"+ "SISTEMA"+ "\n");
	    for (int pos = 0; pos < 5; pos++){
	        A[pos] = (int)(Math.random()*10+1);   
	    }
	    System.out.println("la carta es:  " +  A[0] + " , " + A[1]);
	    int total;
	    total = A[0]+A[1];
	    if(total<16) {
	    	total=total+A[2];
	    	System.out.println("el sistema a tomado otra carta");
	    	System.out.println("el sistema tiene: " + total );
	    	if(total<16) {
	    		total=total+A[3];
		    	System.out.println("el sistema a tomado otra carta");
		    	System.out.println("el sistema tiene: " + total );
		    	if(total<16) {
		    		total=total+A[4];
			    	System.out.println("el sistema a tomado otra carta");
			    	System.out.println("el sistema tiene: " + total );
			    	if(total<16) {
			    		total=total+A[5];
				    	System.out.println("el sistema a tomado otra carta");
				    	System.out.println("el sistema tiene: " + total );
	    	        }else {
		    	    	System.out.println("");
		    	    }
		          }else {
		    	    	System.out.println("");
		    	    }
	    	    }else {
	    	    	System.out.println("");
	    	    }
	    }else {
	    	System.out.println("el total de cartas del sistema es: " + total);
	    	if(total>21) {
	    		System.out.println(" el sistema perdio ");
	    	}
	    }
	}
	
}

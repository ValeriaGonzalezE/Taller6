package ActividadSeis;
import java.util.Scanner;
	import java.util.Iterator;
public class Hard {
	
		static Scanner sc = new Scanner(System.in);
		public  void vectores(){
			int num;
			int As=1;
		    int[] A= new int[13];int x=0;
		    for (int pos = 0; pos < 5; pos++){
		        A[pos] = (int)(Math.random()*10+1);
		           
		    }
		    System.out.println("su cartas son:  " +  A[0] + " , " + A[1]); 
		    int suma=A[0]+A[1];
			System.out.println("la suma de sus cartas hasta el momento es: " + suma);
		   
		    
		    if(A[0]==1) {
		    	System.out.println(" desea que el as cuente como,1. 1 o 2. 11");
		    	int as = sc.nextInt();
		    	if(as==1) {
		    		A[0]=A[0];
		    		
		    	}else if(as==2) {
		    		A[0]=11;
		    	}
		    }
		    if(A[1]==1) {
		    	System.out.println(" desea que el as cuente como,1. 1 o 2. 11");
		    	int as = sc.nextInt();
		    	if(as==1) {
		    		A[1]=A[1];
		    		
		    	}else if(as==2) {
		    		A[1]=11;
		    	}
		    }
		    
		    
		    
		    
		    
		    //suma de cartas entregadas
		    int total = A[0]+A[1];
		    //si las cartas se pasan de 21
		    if(total>21) {
		    	System.out.println("usted se paso de 21, perdio ");
		    //si las cartas son igual a 21
		    }else if(total==21){
		    	System.out.println("usted tiene 21 en sus cartas");
		    //preguntar si añade mas cartas

		    }else {
		    System.out.println("desea otra carta? " + "\n" + "1. si    2. no");
		    int opc= sc.nextInt();
		    //añadir mas cartas---------------------------
		    if(opc==1) {
		    	
		    	if(A[2]==1) {
		    	System.out.println(" desea que el as cuente como,1. 1 o 2. 11");
		    	int as = sc.nextInt();
		    	if(as==1) {
		    		A[2]=A[2];
		    		
		    	}else if(as==2) {
		    		A[2]=11;
		    	}
		    }
		    	
		    	System.out.println("su carta es: " + A[2]);
		    	total=total+A[2];
		    	System.out.println("sus cartas hasta el momento son: " + total);
		    	
		    	//se pasa de 21
		    	if(total>21) {
			    	System.out.println("usted se paso de 21, perdio ");
			    //es igual a 21
			    }else if(total==21){
			    	System.out.println("usted tiene 21 en sus cartas");
			    
			    	
			    //añade cartas por segunda vez--------------
			    }else {
			    	System.out.println("desea otra carta? " + "\n" + "1. si    2. no");
			        opc= sc.nextInt();
			        if(opc==1) {
			        	
			        	if(A[3]==1) {
		    	System.out.println(" desea que el as cuente como,1. 1 o 2. 11");
		    	int as = sc.nextInt();
		    	if(as==1) {
		    		A[3]=A[3];
		    		
		    	}else if(as==2) {
		    		A[3]=11;
		    	}
		    }
			        	
				    	System.out.println("su carta es: " + A[3]);
				    	total = total+ A[3];
				    	System.out.println("sus cartas hasta el momento son: " + total);
				    	//se pasa de 21
				    	if(total>21) {
					    	System.out.println("usted se paso de 21, perdio ");
					    //es igual a 21
					    }else if(total==21){
					    	System.out.println("usted tiene 21 en sus cartas");
					    
					    	
					    //añade cartas por tercera vez--------------
					    }else {
					    	System.out.println("desea otra carta? " + "\n" + "1. si    2. no");
					        opc= sc.nextInt();
					        if(opc==1) {
					        	
					        	if(A[4]==1) {
		    	System.out.println(" desea que el as cuente como,1. 1 o 2. 11");
		    	int as = sc.nextInt();
		    	if(as==1) {
		    		A[4]=A[4];
		    		
		    	}else if(as==2) {
		    		A[4]=11;
		    	}
		    }
					        	
						    	System.out.println("su carta es: " + A[4]);
						    	total = total+ A[4];
						    	System.out.println("sus cartas hasta el momento son: " + total);
						    	if(total>21) {
							    	System.out.println("usted se paso de 21, perdio ");
							    //es igual a 21
							    }else if(total==21){
							    	System.out.println("usted tiene 21 en sus cartas");
		        }else {
		        	System.out.println("desea otra carta? " + "\n" + "1. si    2. no");
			        opc= sc.nextInt();
			        if(opc==1) {
				    	System.out.println("su carta es: " + A[5]);
				    	total = total+ A[5];
				    	System.out.println("sus cartas hasta el momento son: " + total);
				    	if(total>21) {
					    	System.out.println("usted se paso de 21, perdio ");
					    //es igual a 21
					    }else if(total==21){
					    	System.out.println("usted tiene 21 en sus cartas");
		         }else {
		        	 System.out.println("ya no puede tomar mas cartas");
		        	 System.out.println("el total de sus cartas es:" + total);
		         }
			    }else {
			    	total=total;
			    	  System.out.println("el total de sus cartas es: " + total);
			    }
		       }   
			  }else {
				  total=total;
		    	  System.out.println("el total de sus cartas es: " + total);
			  }
		     }
		    }else {
		    	total=total;
		    	  System.out.println("el total de sus cartas es: " + total);
		    }
		   }
	      }else {
	    	  total=A[0]+A[1];
	    	  System.out.println("el total de sus cartas es: " + total);
	      }
	     }	
	    }
	   }


package ActividadSeis;

public class PuntoDos {
	public static void main(String[] args) {
		float [][] precios = new float [10][3];{
		
		precios [0][0] = 1000;   precios [3][1] = 11000; precios [6][2] = 21000;
		precios [0][1] = 2000;   precios [3][2] = 12000; precios [7][0] = 22000;
		precios [0][2] = 3000;   precios [4][0] = 13000; precios [7][1] = 23000;
		precios [1][0] = 4000;   precios [4][1] = 14000; precios [7][2] = 24000;
		precios [1][1] = 5000;   precios [4][2] = 15000; precios [8][0] = 25000;
		precios [1][2] = 6000;   precios [5][0] = 16000; precios [8][1] = 26000;
		precios [2][0] = 7000;   precios [5][1] = 17000; precios [8][2] = 27000;
		precios [2][1] = 8000;   precios [5][2] = 18000; precios [9][0] = 28000;
		precios [2][2] = 9000;   precios [6][0] = 19000; precios [9][1] = 29000;
		precios [3][0] = 10000;  precios [6][1] = 20000; precios [9][2] = 30000;
		
		int i;
		int j;
		
		
		for(  i=0; i<10 ; i++)
		for(j=0;j<3;j++){
			
			System.out.println(precios[i][j]);
		}
}


}
	}
	


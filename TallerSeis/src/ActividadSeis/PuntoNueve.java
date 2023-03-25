package ActividadSeis;

import ActividadSeis.Crupier;
import ActividadSeis.Deck;
import ActividadSeis.Hard;

public class PuntoNueve {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.print();
		
		Hard h = new Hard();
		h.vectores();
		
		Crupier c = new Crupier();
		c.sistema();
		 }
	
}

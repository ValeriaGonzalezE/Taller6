package ActividadSeis;

public class Card {
	
	
	 String suit,name;
	 int points;
	Card(int n1, int n2){
	suit = getSuit(n1);
	name = getName(n2);
	points = getPoints(name);
	}
	public String toString(){
		
	 return "El " + name + " de " + suit;
	}
	public String getName(int i){
	if(i == 1) return "As";
	if(i == 2) return "Dos";
	if(i == 3) return "Tres";
	if(i == 4) return "Cuatro";
	if(i == 5) return "Cinco";
	if(i == 6) return "Seis";
	if(i == 7) return "Siete";
	if(i == 8) return "Ocho";
	if(i == 9) return "Nueve";
	if(i == 10) return "Diez";
	if(i == 11) return "jota";
	if(i == 12) return "reina";
	if(i == 13) return "rey";
	return "error";
	}
	public int getPoints(String n){
	 if(n == "Jota" ||n == "Reina" ||n == "Rey"||n == "Diez")
	 return 10;
	 if(n == "dos")
	 return 2;
	 if(n == "Tres")
	 return 3;
	 if(n == "cuatro")
	 return 4;
	 if(n == "cinco")
	 return 5;
	 if(n == "Seis")
	 return 6;
	 if(n == "Siete")
	 return 7;
	 if(n == "ocho")
	 return 8;
	 if(n == "Nueve")
	 return 9;
	 if(n == "As")
	 return 1;
	 return -1;
	}
	public String getSuit(int i){
	if(i == 1) return "Diamante";
	if(i == 2) return "Treboles";
	if(i == 3) return "Picas";
	if(i == 4) return "corazones";
	return "error";
	}

}

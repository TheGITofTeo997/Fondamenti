package it.unibs.fp.puntirette;

public class Retta {

	private double a;
	private double b;
	private double c;
	
	public Retta(Punto p1, Punto p2) {
		
		a = p2.getY() - p1.getY();
		b = p1.getX() - p2.getX();
		c = p2.getX() * p1.getY() - p1.getX() * p2.getY();
		
	}
	
	public String stampaEquazione() {
		
		String equaz;
		equaz = Esercizio.stampaIf(a, "", "x");
		equaz += Esercizio.stampaIf(b, "+", "y"); 
		equaz += Esercizio.stampaIf(c, "+", "") + "= 0";
		return equaz;
		
	}
	
	public String stampaEquazioneImpl() {
		
		String equaz = "y = ";
		equaz += Esercizio.stampaIf(-a/b, "", "x");
		equaz += Esercizio.stampaIf(-c/b, "+", "");
		return equaz;
		
	}
	
	public Boolean allineato(Punto terzo) {
		
		double equaz = a * terzo.getX() + b * terzo.getY() + c;
		
		return (equaz == 0 ? true : false);
		
	}
	
}

package it.unibs.fp.puntirette;

import it.unibs.fp.mylib.InputDati;

public class Esercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1 = InputDati.leggiDouble("Inserisci x1:");
		double y1 = InputDati.leggiDouble("Inserisci y1:");

		double x2 = InputDati.leggiDouble("Inserisci x2:");
		double y2 = InputDati.leggiDouble("Inserisci y2:");;
		
		Punto punto1 = new Punto(x1, y1);
		Punto punto2 = new Punto(x2, y2);
		
		System.out.println("Distanza: " + punto1.distanza(punto2));
		
		Retta r1 = new Retta(punto1, punto2);
		System.out.println("Equazione: " + r1.stampaEquazione());
		System.out.println("EquazioneImpl: " + r1.stampaEquazioneImpl());
		
		Punto punto3 = new Punto(7,9);
		
		System.out.println(r1.allineato(punto3));
		
		
		
		
	}
	
	public static String stampaIf(double val, String elseVal, String lettera) {
		
		String out;
		out = (val != 0 ? (val < 0 ? "- " : elseVal + " ") + Math.abs(val) + lettera + " " : "");
		return out;
		
	}

}

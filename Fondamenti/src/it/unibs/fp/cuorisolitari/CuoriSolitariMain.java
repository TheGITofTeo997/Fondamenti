package it.unibs.fp.cuorisolitari;

import it.unibs.fp.mylib.InputDati;

public class CuoriSolitariMain {

	public static final String SEPARATOR = "===============================";
	public static final String WELCOME = "Benvenuto in Cuori Solitari:";
	public static final String NICK = "Inserisci il tuo Nickname:";
	public static final String SEX = "Inserisci il sesso:";
	public static final String AGE = "Inserisci la tua età:";
	public static final String COMP_YES = "I due utenti SONO compatibili!";
	public static final String COMP_NO = "I due utenti NON SONO compatibili!";
	public static final String LIMIT = "Il servizio e' riservato ai maggiorenni. Inserisci di nuovo la tua età";
	public static final String MALE = "M";
	public static final String FEMALE = "F";
	public static final String ERRORSEX = "Inserisci il sesso correttamente.";
	public static final int limit = 18;
	
	public static void main(String[] args) {
		saluto();
		CuoreS c1 = buildUser();
		CuoreS c2 = buildUser();
		if(c1.isCompatible(c2)) {
			System.out.println(COMP_YES);
		}
		else
		{
			System.out.println(COMP_NO);
		}
	}
	
	public static void saluto() {
		System.out.println(SEPARATOR);
		System.out.println(WELCOME);
		System.out.println(SEPARATOR);
	}
	
	public static CuoreS buildUser() {
		boolean flag = true;
		String nick= InputDati.leggiStringa(NICK);
		String sex = InputDati.leggiStringa(SEX);
		int age = InputDati.leggiIntero(AGE);
		do{
			if(age<limit) {
			System.out.println(LIMIT);
			age = InputDati.leggiIntero(AGE);
			flag=false;
			}
			else
			{
			flag=true;
			}
		}while(flag==false);
		do{
			if(sex.equals(MALE)==false && sex.equals(FEMALE)==false) {
			System.out.println(ERRORSEX);
			sex = InputDati.leggiStringa(SEX);
			flag=false;
			}
			else
			{
			flag=true;
			}
		}while(flag==false);
		//NICKNAME
		System.out.println(SEPARATOR);
		return new CuoreS(nick, sex, age);
	}
	
	//CHECK METHOD
}

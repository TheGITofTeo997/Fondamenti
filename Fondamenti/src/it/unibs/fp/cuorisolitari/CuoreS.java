package it.unibs.fp.cuorisolitari;

public class CuoreS {
	
	private int age;
	private String sex;
	private String nick;
	private final int compatible = 5;
	
	public CuoreS(String nick, String sex, int age) {
		this.age=age;
		this.sex=sex;
		this.nick=nick;
	}
	
	public boolean isCompatible (CuoreS c2) {
		boolean comp;
		if( (this.sex!=c2.sex) && (Math.abs(this.age - c2.age) <= compatible) )  {
			comp=true;
		}
		else
		{
			comp=false;
		}
		return comp;
	}	
	
	
}

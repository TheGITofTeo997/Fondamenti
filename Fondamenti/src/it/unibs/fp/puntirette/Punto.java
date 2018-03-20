package it.unibs.fp.puntirette;

public class Punto {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	private double x;
	private double y;
	
	public Punto() {
		x = 0;
		y = 0;
	}
	
	public Punto(double cx, double cy) {
		x = cx;
		y = cy;
	}
	
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distanza(Punto secondo) {
		double dist;
		double dx = x - secondo.getX();
		double dy = y - secondo.getY();
		
		dist = Math.sqrt( Math.pow(dx, 2) + Math.pow(dy, 2) );
		
		return dist;
	}
	
}

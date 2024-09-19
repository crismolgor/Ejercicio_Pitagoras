package Pitagoras;

public class Punto {
	private double coordX;
	private double coordY;
	
	public Punto(){
	
	}
	public Punto(double coordX, double coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
	}
	public double getCoordX() {
		return coordX;
	}
	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}
	public double getCoordY() {
		return coordY;
	}
	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
}

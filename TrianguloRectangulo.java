package Pitagoras;
import java.lang.Math;


public class TrianguloRectangulo {
	private Lado lado1;
	private Lado lado2;
	private double hipotenusa;
	
	public TrianguloRectangulo() {
		
	}
	public TrianguloRectangulo(Lado lado1, Lado lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public Lado getLado1() {
		return lado1;
	}
	public void setLado1(Lado lado1) {
		this.lado1 = lado1;
	}
	public Lado getLado2() {
		return lado2;
	}
	public void setLado2(Lado lado2) {
		this.lado2 = lado2;
	}
	public double getHipotenusa() {
		return hipotenusa;
	}
	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	public double calcularHipotenusa() {
		double hipotenusa= Math.sqrt(Math.pow(lado1.calculaLado(),2)+Math.pow(lado2.calculaLado(),2));
		return hipotenusa;
	}
}

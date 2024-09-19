package Pitagoras;
import java.lang.Math;


public class Lado {
 private Punto punto1;
 private Punto punto2;
 
public Lado () {
	
}
public Lado( Punto punto1, Punto punto2) {
	this.punto1= punto1;
	this.punto2=punto2;
}
public Punto getPunto1() {
	return punto1;
}
public void setPunto1(Punto punto1) {
	this.punto1 = punto1;
}
public Punto getPunto2() {
	return punto2;
}
public void setPunto2(Punto punto2) {
	this.punto2 = punto2;
}
public double calculaLado() {
	double lado1= punto2.getCoordX()-punto1.getCoordX();
	double lado2= punto2.getCoordY()-punto1.getCoordY();
	double lado = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	return lado;
}
}

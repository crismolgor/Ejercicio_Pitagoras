package Pitagoras;

public class TeoremaPitagoras {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1= new Punto(5.2,3.5);
		Punto punto2= new Punto(3.2,4.5);
		Lado lado1= new Lado(punto1,punto2);
		Lado lado2= new Lado(punto1,punto2);
		lado1.calculaLado();
		lado2.calculaLado();
		TrianguloRectangulo triangulo= new TrianguloRectangulo(lado1 ,lado2);
		System.out.println("la hipotenusa del tirangulo es:"+ triangulo.calcularHipotenusa());
		
	}

}

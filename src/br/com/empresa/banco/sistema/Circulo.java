package br.com.empresa.banco.sistema;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}

	
	public double calculaArea() {
		return Math.PI * raio * raio;
	}
}

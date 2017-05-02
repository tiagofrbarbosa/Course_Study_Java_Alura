package br.com.empresa.banco.sistema;

public class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		return this.lado * this.lado;
	}
}

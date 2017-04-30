package Curso;

public class Funcionario {
	
	String nome;
	String departamento;
	Double salario;
	String dataEntrada;
	String RG;
	
	void recebeAumento(Double aumento){
		this.salario += aumento;
	}
	
	Double calculaGanhoAtual(){
		return this.salario * 12;
	}
	
}

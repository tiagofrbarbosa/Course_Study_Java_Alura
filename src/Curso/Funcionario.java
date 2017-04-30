package Curso;

public class Funcionario {
	
	String nome;
	String departamento;
	Double salario;
	dataEntrada dataentrada;
	String RG;
	
	void recebeAumento(Double aumento){
		this.salario += aumento;
	}
	
	Double calculaGanhoAtual(){
		return this.salario * 12;
	}
	
	
	void mostra(){
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		dataentrada.getDataFormatada();
		System.out.println(this.RG);
		System.out.println("Ganho anual: " + this.calculaGanhoAtual());
	}
	
}

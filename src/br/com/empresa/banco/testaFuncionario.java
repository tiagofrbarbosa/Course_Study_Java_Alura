package br.com.empresa.banco;

import br.com.empresa.banco.sistema.Funcionario;

public class testaFuncionario {
	
	public static void main(String[] args){
		
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Tiago");
		f1.setDepartamento("TI");
		f1.setSalario(1000.0);
		f1.setDataentrada(1,2,2010);
		f1.setRG("44.444.444.4");
		
		f1.mostra();
		f1.recebeAumento(500.0);
		
		f1.mostra();
	}
	
}

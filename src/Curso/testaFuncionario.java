package Curso;

public class testaFuncionario {
	
	public static void main(String[] args){
		
		dataEntrada data = new dataEntrada();
		//data.preencheData(1, 12, 2010);
		
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Tiago";
		f1.departamento = "TI";
		f1.salario = 1000.0;
		f1.dataentrada = data;
		f1.RG = "44.333.555.4";
		
		f1.mostra();
		f1.recebeAumento(500.0);
		
		f1.mostra();
	}
	
}

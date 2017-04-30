package Curso;

public class Empresa {
	private String nomeEmpresa;
	private String cnpjEmpresa;
	public Funcionario[] funcionarios;
	private int conta = 0;
	
	
	public void setNomeEmpresa(String nomeEmpresa){
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String getEmpresa(){
		return this.nomeEmpresa;
	}
	
	public void setCnpjEmpresa(String cnpjEmpresa){
		this.cnpjEmpresa = cnpjEmpresa;
	}
	
	public String getCnpjEmpresa(){
		return this.cnpjEmpresa;
	}
	
	public Funcionario getFuncionario (int posicao) {
        return this.funcionarios[posicao];
    }
	
	
	void adicionaFuncionarios(Funcionario f){
		funcionarios[conta] = f;
		conta++;
	}
	
	void mostraEmpregados() {
	    for (int i = 0; i < this.conta; i++) {
	        System.out.println("Funcionário na posição: " + i);
	        System.out.println("R$" + this.funcionarios[i].getSalario());
	    }
	}
	
	
	void mostraTodasAsInformacoes() {
	    for (int i = 0; i < this.conta; i++) {
	        System.out.println("Funcionário na posição: " + i);
	        this.funcionarios[i].mostra();
	    }
	}
	
	boolean contem(Funcionario f) {
        for (int i = 0; i < this.conta; i++) {
            if (f == this.funcionarios[i]) {
                return true;
            }
        }
        return false;
    }
}

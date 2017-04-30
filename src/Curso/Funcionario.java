package Curso;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private Double salario;
	private dataEntrada dataentrada = new dataEntrada();
	private String RG;
	
	public Funcionario(String nome){
		this.nome = nome;
	}
	
	public Funcionario(){
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setSalario(Double salario){
		this.salario  = salario;
	}
	
	public Double getSalario(){
		return this.salario;
	}
	
	public void setDataentrada(int dia, int mes, int ano){
		this.dataentrada.preencheData(dia, mes, ano);
	}
	
	public void getDataEntrada(){
		this.dataentrada.getDataFormatada();
	}
	
	
	public void setRG(String RG){
		this.RG = RG;
	}
	
	public String getRG(){
		return this.RG;
	}
	
	
	public void recebeAumento(Double aumento){
		this.salario += aumento;
	}
	
	public Double calculaGanhoAtual(){
		return this.salario * 12;
	}
	
	
	public void mostra(){
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		dataentrada.getDataFormatada();
		System.out.println(this.RG);
		System.out.println("Ganho anual: " + this.calculaGanhoAtual());
	}
	
}

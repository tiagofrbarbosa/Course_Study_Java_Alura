package br.com.empresa.banco.conta;

public abstract class Conta {
	protected double saldo;
	
	public void deposita(double valor) throws ValorInvalidoException{
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor;
		}
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public abstract void atualiza(double taxa);
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

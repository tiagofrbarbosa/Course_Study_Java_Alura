package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta{
	
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}
}

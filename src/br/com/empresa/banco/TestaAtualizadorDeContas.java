package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {

	public static void main(String[] args){
	
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}

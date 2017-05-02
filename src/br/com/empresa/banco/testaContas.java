package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class testaContas {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		
		try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		try {
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			e.getMessage();
			e.printStackTrace();
		}

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}

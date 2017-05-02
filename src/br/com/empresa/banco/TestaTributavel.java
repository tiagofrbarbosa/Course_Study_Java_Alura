package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.sistema.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] main){
		ContaCorrente cc = new ContaCorrente();
		
		
		try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		System.out.println(cc.getSaldo());
	}
	
}

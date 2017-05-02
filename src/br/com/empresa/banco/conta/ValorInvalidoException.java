package br.com.empresa.banco.conta;

public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
	
}

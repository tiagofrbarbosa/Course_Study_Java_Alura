package br.com.empresa.banco.sistema;

public class dataEntrada {
	int dia, mes, ano;
	
	
	void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	void getDataFormatada(){
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}

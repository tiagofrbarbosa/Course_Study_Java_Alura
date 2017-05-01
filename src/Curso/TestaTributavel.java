package Curso;

public class TestaTributavel {
	
	public static void main(String[] main){
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		System.out.println(cc.getSaldo());
	}
	
}

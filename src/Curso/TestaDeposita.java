package Curso;

public class TestaDeposita {
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		
		try{
		cc.deposita(-100);
		}catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}
